package com.first.service;

import com.first.dao.UserDao;
import com.first.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUserDao() {
        userDao.getUser();
    }
}
