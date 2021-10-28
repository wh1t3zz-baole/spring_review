package com.proxy.impl;

import com.proxy.AdminService;

/**
 * @author mac guopan
 * @description spring_review AdminServiceImpl
 * @date 2021/10/21 7:32 下午
 */

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
