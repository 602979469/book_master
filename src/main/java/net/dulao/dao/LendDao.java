package net.dulao.dao;

import net.dulao.entity.Lend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Lend)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-21 17:15:30
 */
public interface LendDao {

    /**
     * 通过ID查询单条数据
     *
     * @param lId 主键
     * @return 实例对象
     */
    Lend queryById(Integer lId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Lend> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lend 实例对象
     * @return 对象列表
     */
    List<Lend> queryAll(Lend lend);

    /**
     * 新增数据
     *
     * @param lend 实例对象
     * @return 影响行数
     */
    int insert(Lend lend);

    /**
     * 修改数据
     *
     * @param lend 实例对象
     * @return 影响行数
     */
    int update(Lend lend);

    /**
     * 通过主键删除数据
     *
     * @param lId 主键
     * @return 影响行数
     */
    int deleteById(Integer lId);

}