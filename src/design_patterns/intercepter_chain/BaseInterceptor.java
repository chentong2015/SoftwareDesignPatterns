package design_patterns.intercepter_chain;

// Interceptor 拦截器:
// Software systems or frameworks want to offer a way to change, or augment, their usual processing cycle
public class BaseInterceptor {

    // 1. 通常可以应用在Web Request请求拦截中: 网页拦截器
    // @Override
    //	public void addInterceptors(InterceptorRegistry registry) {
    //		registry.addInterceptor(new LoginInterceptor())
    //			.addPathPatterns("/admin/**")
    //			.excludePathPatterns("/admin")
    //			.excludePathPatterns("/admin/login");
    //	}
}

