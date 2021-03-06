package net.dulao.service;

import net.dulao.entity.Admin;

import java.util.List;

/**
 * 管理服务
 * (Admin)表服务接口
 *
 * @author makejava
 * @date 2020/07/23
 * @since 2020-07-21 17:15:28
 */
public interface AdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Admin queryById(Integer mId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Admin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    boolean insert(Admin admin);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    boolean update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId);

    /**
     * 查询用户名
     *
     * @param username 用户名
     * @return {@link List<Admin>}
     */
    List<Admin> queryByUsername(String username);

    /**
     * 查询所有
     *
     * @return {@link List<Admin>}
     */
    List<Admin> queryAll();

}