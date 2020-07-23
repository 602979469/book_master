package net.dulao.config;


import net.dulao.interceptor.AdminLoginInterceptor;
import net.dulao.interceptor.StudentLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;


/**
 * 拦截器配置
 *
 * @author Faker
 * @date 2020/07/23
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Resource
    private StudentLoginInterceptor studentLoginInterceptor;
    @Resource
    private AdminLoginInterceptor adminLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        registry.addInterceptor(studentLoginInterceptor).addPathPatterns("/student/**","");
        registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/admin/**","");
    }
}
