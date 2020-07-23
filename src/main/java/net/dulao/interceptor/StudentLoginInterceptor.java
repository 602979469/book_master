package net.dulao.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 学生登录拦截器
 *
 * @author Faker
 * @date 2020/07/23
 */
@Configuration
public class StudentLoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * 前处理
     *
     * @param request  请求
     * @param response 响应
     * @param handler  处理程序
     * @return boolean* @throws Exception 异常
     */
    @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object sid = request.getSession().getAttribute("sId");
        if (sid == null) {
            response.sendRedirect("/login.html");
            return false;
        }
        return true;
	}
}
