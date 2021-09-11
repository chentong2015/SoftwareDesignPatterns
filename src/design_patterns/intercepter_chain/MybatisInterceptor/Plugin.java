package design_patterns.intercepter_chain.MybatisInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Plugin implements InvocationHandler {

    private final Object target;
    private final Interceptor interceptor;
    private final Map<Class<?>, Set<Method>> signatureMap;

    private Plugin(Object target, Interceptor interceptor, Map<Class<?>, Set<Method>> signatureMap) {
        this.target = target;
        this.interceptor = interceptor;
        this.signatureMap = signatureMap;
    }

    public static Object wrap(Object target, Interceptor interceptor) {
        Map<Class<?>, Set<Method>> signatureMap = getSignatureMap(interceptor);
        Class<?> type = target.getClass();
        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
        if (interfaces.length > 0) {
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    interfaces, new Plugin(target, interceptor, signatureMap));
        }
        return target;
    }

    // 拿到实现Interceptor接口的类型所添加的所有注解
    private static Map<Class<?>, Set<Method>> getSignatureMap(Interceptor interceptor) {
        // Intercepts interceptsAnnotation = interceptor.getClass().getAnnotation(Intercepts.class);
        // if (interceptsAnnotation == null) {
        //     throw new PluginException("No @Intercepts annotation was found in interceptor "
        //     + interceptor.getClass().getName());
        // }
        // Signature[] sigs = interceptsAnnotation.value();
        Map<Class<?>, Set<Method>> signatureMap = new HashMap<>();
        // for (Signature sig : sigs) {
        //     Set<Method> methods = MapUtil.computeIfAbsent(signatureMap, sig.type(), k -> new HashSet<>());
        //     try {
        //         Method method = sig.type().getMethod(sig.method(), sig.args());
        //         methods.add(method);
        //     } catch (NoSuchMethodException e) {
        //         throw new PluginException("Could not find method on "
        //         + sig.type() + " named " + sig.method() + ". Cause: " + e, e);
        //     }
        // }
        return signatureMap;
    }

    // 拿到type类型所实现的所有接口
    private static Class<?>[] getAllInterfaces(Class<?> type, Map<Class<?>, Set<Method>> signatureMap) {
        Set<Class<?>> interfaces = new HashSet<>();
        while (type != null) {
            for (Class<?> c : type.getInterfaces()) {
                if (signatureMap.containsKey(c)) {
                    interfaces.add(c);
                }
            }
            type = type.getSuperclass();
        }
        return interfaces.toArray(new Class<?>[0]);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            Set<Method> methods = signatureMap.get(method.getDeclaringClass());
            if (methods != null && methods.contains(method)) {
                return interceptor.intercept(new Invocation(target, method, args));
            }
            return method.invoke(target, args);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error");
        }
    }
}
