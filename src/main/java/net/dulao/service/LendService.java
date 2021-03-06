package net.dulao.service;

import net.dulao.entity.Lend;

import java.util.List;

/**
 * (Lend)表服务接口
 *
 * @author makejava
 * @since 2020-07-21 17:15:30
 */
public interface LendService {

    /**
     * 通过ID查询单条数据
     *
     * @param lId 主键
     * @return 实例对象
     */
    Lend queryById(Integer lId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Lend> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param lend 实例对象
     * @return 实例对象
     */
    boolean insert(Lend lend);

    /**
     * 修改数据
     *
     * @param lend 实例对象
     * @return 实例对象
     */
    boolean update(Lend lend);

    /**
     * 通过主键删除数据
     *
     * @param lId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer lId);

    /**
     * 查询学生
     *
     * @param id id
     * @return {@link List<Lend>}
     */
    List<Lend> queryByStudent(Integer id);

    /**
     * 查询书
     *
     * @param id id
     * @return {@link List<Lend>}
     */
    List<Lend> queryByBook(Integer id);

    /**
     * 查询所有
     *
     * @return {@link List<Lend>}
     */
    List<Lend> queryAll();

}