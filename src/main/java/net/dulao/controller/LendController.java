package net.dulao.controller;

import net.dulao.entity.Lend;
import net.dulao.service.LendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 提供控制器
 *
 * @author Faker
 * @date 2020/07/23
 */
@RestController
@RequestMapping("lendHandler")
public class LendController {
    @Resource
    private LendService lendService;

    /**
     * 选择一个
     *
     * @param id id
     * @return {@link Lend}
     */
    @GetMapping("selectOne")
    public Lend selectOne(Integer id) {
        return this.lendService.queryById(id);
    }

    /**
     * 选择通过id
     *
     * @param id id
     * @return {@link Lend}
     */
    @GetMapping("selectById")
    public Lend selectById(Integer id) {
        return this.lendService.queryById(id);
    }

    /**
     * 选择的书
     *
     * @param id id
     * @return {@link List<Lend>}
     */
    @GetMapping("selectByBook")
    public List<Lend> selectByBook(Integer id){
        return this.lendService.queryByBook(id);
    }

    /**
     * 选择的
     *
     * @param id id
     * @return {@link List<Lend>}
     */
    @GetMapping("selectByStudent")
    public List<Lend> selectBy(Integer id){
        return this.lendService.queryByStudent(id);
    }

    /**
     * 选择所有
     *
     * @return {@link List<Lend>}
     */
    @GetMapping("selectAll")
    public List<Lend> selectAll(){
        return this.lendService.queryAll();
    }

    /**
     * 选择的限制
     *
     * @param offset 抵消
     * @param limit  限制
     * @return {@link List<Lend>}
     */
    @GetMapping("selectByLimit")
    public List<Lend> selectByLimit(Integer offset, Integer limit){
        return this.lendService.queryAllByLimit(offset,limit);
    }

    /**
     * 插入
     *
     * @param lend 借
     * @return {@link String}
     */
    @GetMapping("insert")
    public String insert(Lend lend){
        if (lendService.insert(lend)){
            return "success";
        }
        return "fail";
    }

    /**
     * 更新
     *
     * @param lend 借
     * @return {@link String}
     */
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