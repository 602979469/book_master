package net.dulao.controller;

import net.dulao.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-07-21 17:15:31
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    @GetMapping("login")
    public String login(String username,String password){
        if(studentService.queryByUsername(username).get(0).getSPassword().equals(password))
            return "success";
        return "fail";
    }
}