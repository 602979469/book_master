package net.dulao.controller;

import net.dulao.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-07-21 17:15:28
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    @GetMapping("login")
    public String login(String username,String password){
        if(adminService.queryByUsername(username).get(0).getMPassword().equals(password))
            return "success";
        return "fail";
    }
}