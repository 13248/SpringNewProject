package com.first.dao;

public class UserDaoSqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("这里是SqlServer获取");
    }
}
