package net.dulao.controller;

import net.dulao.entity.Book;
import net.dulao.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2020-07-21 17:47:07
 */
@RestController
@RequestMapping("book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectById")
    public Book selectById(Integer id) {
        return this.bookService.queryById(id);
    }

    @GetMapping("selectByName")
    public List<Book> selectByName(String name){
        return this.bookService.queryByName(name);
    }

    @GetMapping("selectAll")
    public List<Book> selectAll(){
        return this.bookService.queryAll();
    }

    @GetMapping("selectByLimit")
    public List<Book> selectByLimit(Integer offset,Integer limit){
        return this.bookService.queryAllByLimit(offset,limit);
    }

    @GetMapping("insert")
    public String insert(Book book){
        if (bookService.insert(book)){
            return "success";
        }
        return "fail";
    }

    @GetMapping("update")
    public String update(Book book){
        if (bookService.update(book)){
            return "success";
        }
        return "fail";
    }

    @GetMapping("delete")
    public String delete(Integer id){
        if (bookService.deleteById(id)){
            return "success";
        }
        return "fail";
    }
}