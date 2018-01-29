package com.ggj.dao;

import com.ggj.model.User;

/**
 * Created by Administrator on 2018/1/29.
 */
public interface UserMapper {
    User login(User user);
    User checkName(String name);
    boolean saveUser(User user);
    boolean updateUser(User user);
}
