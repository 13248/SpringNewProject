package com.first.dao;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("这里是Oracle获取");
    }
}
