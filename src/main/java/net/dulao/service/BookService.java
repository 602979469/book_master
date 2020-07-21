package net.dulao.service;

import net.dulao.entity.Book;

import java.util.List;

/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2020-07-21 17:47:07
 */
public interface BookService {

    /**
     * 通过ID查询单条数据
     *
     * @param bId 主键
     * @return 实例对象
     */
    Book queryById(Integer bId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Book> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    boolean insert(Book book);

    /**
     * 修改数据
     *
     * @param book 实例对象
     * @return 实例对象
     */
    boolean update(Book book);

    /**
     * 通过主键删除数据
     *
     * @param bId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bId);


    List<Book> queryByName(String name);

    List<Book> queryAll();
}