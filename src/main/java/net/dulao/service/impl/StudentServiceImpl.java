package net.dulao.service.impl;

import net.dulao.dao.StudentDao;
import net.dulao.entity.Student;
import net.dulao.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2020-07-21 17:15:31
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer sId) {
        return this.studentDao.queryById(sId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Student student) {
        return this.studentDao.insert(student)>0;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Student student) {
        return this.studentDao.update(student)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.studentDao.deleteById(sId) > 0;
    }

    @Override
    public List<Student> queryByUsername(String username) {
        Student student = new Student();
        student.setSUsername(username);
        return this.studentDao.queryAll(student);
    }

    @Override
    public List<Student> queryAll() {
        Student student = new Student();
        return this.studentDao.queryAll(student);
    }
}