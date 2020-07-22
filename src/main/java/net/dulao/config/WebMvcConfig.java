package net.dulao.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //配置路径映射
        registry.addViewController("/").setViewName("../static/index.html");
        registry.addViewController("/login").setViewName("../static/index.html");
        registry.addViewController("/index").setViewName("../static/index.html");
        registry.addViewController("/login.html").setViewName("../static/index.html");
        registry.addViewController("/index.html").setViewName("../static/index.html");
    }
}
