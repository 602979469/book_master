package net.dulao.service.impl;

import net.dulao.dao.BookDao;
import net.dulao.entity.Book;
import net.dulao.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)表服务实现类
 *
 * @author makejava
 * @since 2020-07-21 17:47:07
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bId 主键
     * @return 实例对象
     */
    @Override
    public Book queryById(Integer bId) {
        return this.bookDao.queryById(bId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Book> queryAllByLimit(int offset, int limit) {
        return this.bookDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Book book) {

        return this.bookDao.insert(book)>0;
    }

    /**
     * 修改数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Book book) {

        return this.bookDao.update(book)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param bId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bId) {
        return this.bookDao.deleteById(bId) > 0;
    }


    /**
     * 按名称查询
     *
     * @param name 的名字
     * @return {@link List<Book>}
     */
    @Override
    public List<Book> queryByName(String name) {
        Book book = new Book();
        book.setBName(name);
        return this.bookDao.queryAll(book);
    }

    /**
     * 查询所有
     *
     * @return {@link List<Book>}
     */
    @Override
    public List<Book> queryAll() {
        Book book = new Book();
        return this.bookDao.queryAll(book);
    }
}