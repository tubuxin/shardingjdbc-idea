package com.example.shardingjdbc.core.service.impl;

import com.example.shardingjdbc.core.entity.User;
import com.example.shardingjdbc.core.dao.UserDAO;
import com.example.shardingjdbc.core.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tbx
 * @since 2020-04-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDAO, User> implements UserService {

}
