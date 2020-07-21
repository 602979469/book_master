package net.dulao.controller;

import net.dulao.entity.Lend;
import net.dulao.service.LendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Lend)表控制层
 *
 * @author makejava
 * @since 2020-07-21 17:15:30
 */
@RestController
@RequestMapping("lend")
public class LendController {
    /**
     * 服务对象
     */
    @Resource
    private LendService lendService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Lend selectOne(Integer id) {
        return this.lendService.queryById(id);
    }

}