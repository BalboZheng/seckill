package com.zz.seckill.service;

import com.github.pagehelper.PageInfo;
import com.zz.seckill.bean.User;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}