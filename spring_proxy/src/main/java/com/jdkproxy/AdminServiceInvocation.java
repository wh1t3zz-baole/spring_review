package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author mac guopan
 * @description spring_review AdminServiceInvocation
 * @date 2021/10/21 8:02 下午
 */

public class AdminServiceInvocation implements InvocationHandler {

    private AdminService adminService;

    public AdminServiceInvocation(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置操作");
        Object object = method.invoke(adminService);
        System.out.println("后置操作");
        return object;
    }
}
