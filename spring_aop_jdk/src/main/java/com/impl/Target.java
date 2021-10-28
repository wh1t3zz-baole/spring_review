package com.impl;

import com.dao.TargetInterface;

public class Target implements TargetInterface {
    @Override
    public void method() {
        System.out.println("spring aop jdk test!");
    }
}
