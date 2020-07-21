package net.dulao.controller;

import net.dulao.entity.Lend;
import net.dulao.service.LendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectById")
    public Lend selectById(Integer id) {
        return this.lendService.queryById(id);
    }

    @GetMapping("selectByBook")
    public List<Lend> selectByBook(Integer id){
        return this.lendService.queryByBook(id);
    }

    @GetMapping("selectByStudent")
    public List<Lend> selectBy(Integer id){
        return this.lendService.queryByStudent(id);
    }

    @GetMapping("selectAll")
    public List<Lend> selectAll(){
        return this.lendService.queryAll();
    }

    @GetMapping("selectByLimit")
    public List<Lend> selectByLimit(Integer offset, Integer limit){
        return this.lendService.queryAllByLimit(offset,limit);
    }

    @GetMapping("insert")
    public String insert(Lend lend){
        if (lendService.insert(lend)){
            return "success";
        }
        return "fail";
    }

    @GetMapping("update")
    public String update(Lend lend){
        if (lendService.update(lend)){
            return "success";
        }
        return "fail";
    }

    @GetMapping("delete")
    public String delete(Integer id){
        if (lendService.deleteById(id)){
            return "success";
        }
        return "fail";
    }

}