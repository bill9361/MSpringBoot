package com.bill.mspringboot.mapper;

import com.bill.mspringboot.entity.User;

/**
 * SpringBoot可以直接使用注解的方式@Select("select * from user")也可以使用UserMapper.xml的方式
 * Description:UserMapper <br/>
 * Date:2018年7月23日 下午5:23:02 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public interface UserMapper
{
	/**
	 * 根据Id查找用户
	 * @param id
	 * @return
	 */
	public User queryById(String id);
}
