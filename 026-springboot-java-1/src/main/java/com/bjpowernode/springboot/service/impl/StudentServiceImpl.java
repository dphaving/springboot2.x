package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service.impl
 * Description:
 *
 * @date:2020/3/9 9:11
 * @author:蛙课网
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Say Hello";
    }
}
