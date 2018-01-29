package com.ggj.service;

import com.ggj.model.User;

/**
 * Created by Administrator on 2018/1/29.
 */
public interface UserService {
    User login(User user);
    User checkName(String name);
    boolean saveUser(User user);
    boolean updateUser(User user);
}
