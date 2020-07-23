package net.dulao.controller;

import net.dulao.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 管理控制器
 *
 * @author Faker
 * @date 2020/07/23
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;


}