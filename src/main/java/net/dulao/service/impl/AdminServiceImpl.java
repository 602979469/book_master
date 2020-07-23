package net.dulao.service.impl;

import net.dulao.dao.AdminDao;
import net.dulao.entity.Admin;
import net.dulao.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Admin)表服务实现类
 *
 * @author makejava
 * @since 2020-07-21 17:15:28
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public Admin queryById(Integer mId) {
        return this.adminDao.queryById(mId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Admin> queryAllByLimit(int offset, int limit) {
        return this.adminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Admin admin) {

        return this.adminDao.insert(admin)>0;
    }

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Admin admin) {

        return this.adminDao.update(admin)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) {
        return this.adminDao.deleteById(mId) > 0;
    }

    /**
     * 查询用户名
     *
     * @param username 用户名
     * @return {@link List<Admin>}
     */
    @Override
    public List<Admin> queryByUsername(String username) {
        Admin admin = new Admin();
        admin.setMUsername(username);
        return this.adminDao.queryAll(admin);
    }

    /**
     * 查询所有
     *
     * @return {@link List<Admin>}
     */
    @Override
    public List<Admin> queryAll() {
        Admin admin = new Admin();
        return this.adminDao.queryAll(admin);
    }
}