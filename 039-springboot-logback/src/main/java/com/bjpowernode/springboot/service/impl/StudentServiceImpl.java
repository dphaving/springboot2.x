package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service.impl
 * Description:
 *
 * @date:2020/3/10 9:14
 * @author:蛙课网
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
