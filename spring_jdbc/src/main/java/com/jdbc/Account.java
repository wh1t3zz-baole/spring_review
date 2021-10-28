package com.jdbc;

/**
 * @author mac guopan
 * @description spring_review Account
 * @date 2021/10/26 11:45 下午
 */

public class Account {
    private String name;
    private Double Money;

    public Account() {
    }

    public Account(String name, Double money) {
        this.name = name;
        Money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double money) {
        Money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", Money=" + Money +
                '}';
    }
}
