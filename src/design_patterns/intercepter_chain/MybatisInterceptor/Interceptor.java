package design_patterns.intercepter_chain.MybatisInterceptor;

public interface Interceptor {

    Object intercept(Invocation invocation) throws Throwable;

    default Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
}
