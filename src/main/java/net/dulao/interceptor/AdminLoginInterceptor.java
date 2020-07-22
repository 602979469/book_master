package net.dulao.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Configuration
public class AdminLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object sid = request.getSession().getAttribute("aId");
        if (sid == null) {
            System.out.println("尚未登录，调到登录页面");
            response.sendRedirect("/login.html");
            return false;
        }
        return true;
	}
}
