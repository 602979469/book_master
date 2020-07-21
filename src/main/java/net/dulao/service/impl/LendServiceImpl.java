package net.dulao.service.impl;

import net.dulao.dao.LendDao;
import net.dulao.entity.Lend;
import net.dulao.service.LendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Lend)表服务实现类
 *
 * @author makejava
 * @since 2020-07-21 17:15:30
 */
@Service("lendService")
public class LendServiceImpl implements LendService {
    @Resource
    private LendDao lendDao;

    /**
     * 通过ID查询单条数据
     *
     * @param lId 主键
     * @return 实例对象
     */
    @Override
    public Lend queryById(Integer lId) {
        return this.lendDao.queryById(lId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Lend> queryAllByLimit(int offset, int limit) {
        return this.lendDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param lend 实例对象
     * @return 实例对象
     */
    @Override
    public Lend insert(Lend lend) {
        this.lendDao.insert(lend);
        return lend;
    }

    /**
     * 修改数据
     *
     * @param lend 实例对象
     * @return 实例对象
     */
    @Override
    public Lend update(Lend lend) {
        this.lendDao.update(lend);
        return this.queryById(lend.getLId());
    }

    /**
     * 通过主键删除数据
     *
     * @param lId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer lId) {
        return this.lendDao.deleteById(lId) > 0;
    }
}