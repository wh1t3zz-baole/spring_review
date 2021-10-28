package com.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author mac guopan
 * @description spring_review AdminServiceDynamicProxy
 * @date 2021/10/21 9:07 下午
 */

public class AdminServiceDynamicProxy {
    private AdminService adminService;
    private AdminServiceInvocation adminServiceInvocation;

    public AdminServiceDynamicProxy(AdminService adminService, AdminServiceInvocation adminServiceInvocation) {
        this.adminService = adminService;
        this.adminServiceInvocation = adminServiceInvocation;
    }

    public Object getPersoProxy(){
        Object object = Proxy.newProxyInstance(adminService.getClass().getClassLoader(), adminService.getClass().getInterfaces(), adminServiceInvocation);
        return object;
    }
}
