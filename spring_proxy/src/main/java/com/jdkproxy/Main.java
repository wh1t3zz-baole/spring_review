package com.jdkproxy;

import com.jdkproxy.impl.AdminServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mac guopan
 * @description spring_review Main
 * @date 2021/10/22 1:41 下午
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("创建目标对象");
        AdminService adminService = new AdminServiceImpl();
        System.out.println("目标对象："+adminService.getClass());
        AdminService proxy = (AdminService) Proxy.newProxyInstance(adminService.getClass().getClassLoader(), adminService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置");
                Object object = method.invoke(adminService);
                System.out.println("后置");
                return object;
            }
        });

        Object ob = proxy.find();
        System.out.println("代理对象："+ob.getClass());
    }
}
