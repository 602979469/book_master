package net.dulao.controller;

import net.dulao.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 学生控制器
 *
 * @author Faker
 * @date 2020/07/23
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;

}