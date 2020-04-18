package com.example.shardingjdbc.core.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.shardingjdbc.core.entity.User;
import com.example.shardingjdbc.core.service.UserService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tbx
 * @since 2020-04-18
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Resource
    private UserService areaService;

    @GetMapping("/test")
    public String getAreaList(){
        return JSONObject.toJSONString(areaService.list());
    }
    
    
    @GetMapping("/insert")
    public void insert(){
        
    	User user  = new User();
    	user.setCityId(1);
    	user.setSex(1);
    	user.setId(10l);
    	user.setName("abc");
    	user.setPassword("passwd");
    	user.setPhone("12312");
    	areaService.save(user);
    	
    	
    	user  = new User();
    	user.setCityId(2);
    	user.setSex(1);
    	user.setId(11l);
    	user.setName("abc");
    	user.setPassword("passwd");
    	user.setPhone("12312");
    	areaService.save(user);
    }


}
