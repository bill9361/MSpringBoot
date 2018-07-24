package com.bill.mspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.mspringboot.entity.User;
import com.bill.mspringboot.mapper.UserMapper;
import com.bill.mspringboot.service.UserService;

/**
 * Description: <br/>
 * Date:2018年7月23日 下午5:24:20 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryById(String id)
	{
		return userMapper.queryById(id);
	}

}
