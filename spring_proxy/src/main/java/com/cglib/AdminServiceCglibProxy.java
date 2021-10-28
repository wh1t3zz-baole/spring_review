package com.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @author mac guopan
 * @description spring_review AdminServiceCglibProxy
 * @date 2021/10/22 5:24 下午
 */

public class AdminServiceCglibProxy{

    public static void main(String[] args) {
        AdminService adminService = new AdminService();

        // 创建增强器
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(adminService.getClass());
        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置");
                Object proxy = method.invoke(adminService, objects);
                System.out.println("后置");
                return proxy;
            }
        });
        // 创建代理对象
        AdminService targetProxy = (AdminService) enhancer.create();
        targetProxy.find();

    }


}
