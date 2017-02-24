package com.zqx.page.service;

import com.zqx.page.dao.JdbcSqlStudentDaoImpl;
import com.zqx.page.dao.StudentDao;
import com.zqx.page.model.Pager;
import com.zqx.page.model.Student;

/**
 * Created by adc333 on 2017/2/19.
 */
public class JdbcSqlStudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public JdbcSqlStudentServiceImpl(){
        studentDao = new JdbcSqlStudentDaoImpl();
    }
    @Override
    public Pager<Student> findStudent(Student searchModel, int pageNum,
                                      int pageSize) {
        Pager<Student> result = studentDao.findStudent(searchModel, pageNum,
                pageSize);
        return result;
    }

}
