package com.first.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("这里是获取Mysql");
    }
}
