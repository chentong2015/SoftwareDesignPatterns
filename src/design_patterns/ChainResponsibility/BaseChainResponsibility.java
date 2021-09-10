package design_patterns.ChainResponsibility;

// 责任链设计模式
// 运用场景：MyBatis源码中关于Plugins插件的实现
// public class Configuration 
//    protected final InterceptorChain interceptorChain = new InterceptorChain();

// TODO: https://www.youtube.com/watch?v=YQ03IyRu1Zo
public class BaseChainResponsibility {

    //
    // public class InterceptorChain {
    // 
    //   private final List<Interceptor> interceptors = new ArrayList<>();
    // 
    //   public Object pluginAll(Object target) {
    //     for (Interceptor interceptor : interceptors) {
    //       target = interceptor.plugin(target);
    //     }
    //     return target;
    //   }
    // 
    //   public void addInterceptor(Interceptor interceptor) {
    //     interceptors.add(interceptor);
    //   }
    // 
    //   public List<Interceptor> getInterceptors() {
    //     // Returns an unmodifiable view of the specified list.
    //     return Collections.unmodifiableList(interceptors);
    //   }
    // 
    // }
    // 

    // public interface Interceptor {
    //
    //   Object intercept(Invocation invocation) throws Throwable;
    //   
    //   default Object plugin(Object target) {
    //     return Plugin.wrap(target, this);
    //   }
    //   
    //   default void setProperties(Properties properties) {
    //     // NOP
    //   }
    //
    // }

    // public class Plugin implements InvocationHandler {
    //
    // private final Object target;
    // private final Interceptor interceptor;
    // private final Map<Class<?>, Set<Method>> signatureMap;
    //
    // private Plugin(Object target, Interceptor interceptor, Map<Class<?>, Set<Method>> signatureMap) {
    //   this.target = target;
    //   this.interceptor = interceptor;
    //   this.signatureMap = signatureMap;
    // }
    //
    // public static Object wrap(Object target, Interceptor interceptor) {
    //   Map<Class<?>, Set<Method>> signatureMap = getSignatureMap(interceptor);
    //   Class<?> type = target.getClass();
    //   Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
    //   if (interfaces.length > 0) {
    //     return Proxy.newProxyInstance(
    //         type.getClassLoader(),
    //         interfaces,
    //         new Plugin(target, interceptor, signatureMap));
    //   }
    //   return target;
    // }
    //
    // @Override
    // public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //   try {
    //     Set<Method> methods = signatureMap.get(method.getDeclaringClass());
    //     if (methods != null && methods.contains(method)) {
    //       return interceptor.intercept(new Invocation(target, method, args));
    //     }
    //     return method.invoke(target, args);
    //   } catch (Exception e) {
    //     throw ExceptionUtil.unwrapThrowable(e);
    //   }
    // }
}
