package com.aop.impl;
import com.aop.AdminService;
import org.springframework.stereotype.Service;

/**
 * @author mac guopan
 * @description spring_review AdminServiceImpl
 * @date 2021/10/21 7:32 下午
 */

@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public Object find() {
        System.out.println("find");
        return new Object();
    }
}
