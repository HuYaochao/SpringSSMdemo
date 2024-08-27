package org.company.config;

import org.company.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author hyc
 * Date: 2024/8/27
 * @version 1.0
 */

//将配置注入容器
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //拦截所有资源
                .addPathPatterns("/**")
                //将指定资源放行
                .excludePathPatterns("/index.html", "/login.html","/js/**","/login");
    }
}
