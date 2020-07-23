package net.dulao.controller;

import net.dulao.entity.Admin;
import net.dulao.entity.Student;
import net.dulao.service.AdminService;
import net.dulao.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 登录控制器
 *
 * @author Faker
 * @date 2020/07/23
 */
@RestController
public class LoginController {

    @Resource
    private AdminService adminService;
    @Resource
    private StudentService studentService;

    /**
     * 管理员登录
     *
     * @param request  请求
     * @param username 用户名
     * @param password 密码
     * @return {@link String}
     */
    @GetMapping("adminLogin")
    public String adminLogin(HttpServletRequest request, String username, String password){
        if (username==null | "".equals(username) | password==null | "".equals(password)) {
            return "fail";
        }
        List<Admin> admins = adminService.queryByUsername(username);
        if (admins.size()==0){
            return "fail";
        }
        else{
            boolean equals = password.equals(admins.get(0).getMPassword());
            if (equals){
                request.getSession().setAttribute("aId",admins.get(0).getMId());
                return "success";
            }
        }
        return "fail";
    }


    /**
     * 学生登录
     *
     * @param request  请求
     * @param username 用户名
     * @param password 密码
     * @return {@link String}
     */
    @GetMapping("studentLogin")
    public String studentLogin(HttpServletRequest request,String username, String password){
        if (username==null | "".equals(username) | password==null | "".equals(password)) {
            return "fail";
        }
        List<Student> students = studentService.queryByUsername(username);
        if (students.size()==0){
            return "fail";
        }
        else{
            boolean equals = password.equals(students.get(0).getSPassword());
            if (equals){
                request.getSession().setAttribute("sId",students.get(0).getSId());
                return "success";
            }
        }
        return "fail";
    }

}
