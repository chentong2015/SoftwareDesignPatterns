package core_structure_patterns.proxy.dynamic_proxy;

// Mybatis源码使用Java所实现的动态代理
public class MyBatisProxyTest {

    // 1. 通过提供接口类型，MyBatis是如何创建接口类型的实例化对象的，调用并执行接口方法的 ?
    //    BlogMapper mapper = session.getMapper(BlogMapper.class);
    //    Blog blog = mapper.selectBlog(10);
    //
    //    调用MapperProxyFactory.newInstance()方法, 其中会创建MapperProxy对象，作为handler
    //    public T newInstance(SqlSession sqlSession) {
    //       final MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession, mapperInterface, methodCache);
    //       return newInstance(mapperProxy);
    //    }
    //
    //    public class MapperProxy<T> implements InvocationHandler, Serializable {
    //      ...
    //      @Override
    //      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //         try {
    //           if (Object.class.equals(method.getDeclaringClass())) {
    //             return method.invoke(this, args);
    //           } else {
    //             return cachedInvoker(method).invoke(proxy, method, args, sqlSession);
    //           }
    //         } catch (Throwable t) {
    //           throw ExceptionUtil.unwrapThrowable(t);
    //         }
    //      }
    //    }
    //
    //    protected T newInstance(MapperProxy<T> mapperProxy) {
    //       return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] { mapperInterface }, mapperProxy);
    //    }

    // 2. SqlSessionManager使用动态代理
    //    private SqlSessionManager(SqlSessionFactory sqlSessionFactory) {
    //      this.sqlSessionFactory = sqlSessionFactory;
    //      this.sqlSessionProxy = (SqlSession) Proxy.newProxyInstance(
    //      SqlSessionFactory.class.getClassLoader(), new Class[]{SqlSession.class}, new SqlSessionInterceptor());
    //    }
    //
    //    private class SqlSessionInterceptor implements InvocationHandler {
    //      @Override
    //      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //        final SqlSession sqlSession = SqlSessionManager.this.localSqlSession.get();
    //        if (sqlSession != null) {
    //          try {
    //            return method.invoke(sqlSession, args);
    //          } catch (Throwable t) {
    //            throw ExceptionUtil.unwrapThrowable(t);
    //          }
    //        }
    //     }
    //   }

    // 3. MyBatis Plugin插件的实现/拦截器
    //    public class Plugin implements InvocationHandler {
    //      public static Object wrap(Object target, Interceptor interceptor) {
    //        Map<Class<?>, Set<Method>> signatureMap = getSignatureMap(interceptor);
    //        Class<?> type = target.getClass();
    //        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
    //        if (interfaces.length > 0) {
    //            return Proxy.newProxyInstance(
    //            target.getClass().getClassLoader(), interfaces, new Plugin(target, interceptor, signatureMap));
    //        }
    //        return target;
    //      }
    //
    //      @Override
    //      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //          try {
    //              Set<Method> methods = signatureMap.get(method.getDeclaringClass());
    //              if (methods != null && methods.contains(method)) {
    //                  return interceptor.intercept(new Invocation(target, method, args));
    //              }
    //              return method.invoke(target, args);
    //          } catch (Exception e) {
    //              e.printStackTrace();
    //              throw new Exception("Error");
    //          }
    //      }
    //   }
}
