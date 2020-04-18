package com.example.shardingjdbc.core.service.impl;

import com.example.shardingjdbc.core.entity.Address;
import com.example.shardingjdbc.core.dao.AddressDAO;
import com.example.shardingjdbc.core.service.AddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressDAO, Address> implements AddressService {

}
