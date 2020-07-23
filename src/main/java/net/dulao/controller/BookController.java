package net.dulao.controller;

import net.dulao.entity.Book;
import net.dulao.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 本控制器
 *
 * @author Faker
 * @date 2020/07/23
 */
@RestController
@RequestMapping("bookHandler")
public class BookController {
    @Resource
    private BookService bookService;

    /**
     * 选择通过id
     *
     * @param id id
     * @return {@link Book}
     */
    @GetMapping("selectById")
    public Book selectById(Integer id) {
        return this.bookService.queryById(id);
    }

    /**
     * 选择的名字
     *
     * @param name 的名字
     * @return {@link List<Book>}
     */
    @GetMapping("selectByName")
    public List<Book> selectByName(String name){
        return this.bookService.queryByName(name);
    }

    /**
     * 选择所有
     *
     * @return {@link List<Book>}
     */
    @GetMapping("selectAll")
    public List<Book> selectAll(){
        return this.bookService.queryAll();
    }

    /**
     * 选择的限制
     *
     * @param offset 抵消
     * @param limit  限制
     * @return {@link List<Book>}
     */
    @GetMapping("selectByLimit")
    public List<Book> selectByLimit(Integer offset,Integer limit){
        return this.bookService.queryAllByLimit(offset,limit);
    }


    /**
     * 插入
     *
     * @param book 书
     * @return {@link String}
     */
    @GetMapping("insert")
    public String insert(Book book){
        if (bookService.insert(book)){
            return "successful";
        }
        return "fail";
    }


    /**
     * 更新
     *
     * @param book 书
     * @return {@link String}
     */
    @GetMapping("update")
    public String update(Book book){
        if (bookService.update(book)){
            return "success";
        }
        return "failure";
    }

    /**
     * 删除
     *
     * @param id id
     * @return {@link String}
     */
    @GetMapping("delete")
    public String delete(Integer id){
        if (bookService.deleteById(id)){
            return "success";
        }
        return "failure";
    }
}