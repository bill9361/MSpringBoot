package com.bill.mspringboot.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.mspringboot.entity.User;
import com.bill.mspringboot.service.UserService;

/**
 * http://localhost:8888/front/queryById.do?id=2ed74245-335c-4e20-97cb-d0a2493e924d
 * SpringBoot访问的时候默认无需加上项目名，它自己会识别，其实就是在内置的Tomcat中配置了path="/"
 * Description: <br/>
 * Date:2018年7月24日 上午11:19:24 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/front")
@Controller
public class FrontController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	public void login(String username,String password)
	{
		System.out.println("username:"+username+" password:"+password);
	}
	
	@RequestMapping("/queryById.do")
	@ResponseBody
	public User queryById(String id)
	{
		System.out.println("FrontController...queryById:id="+id);
		return userService.queryById(id);
	}
	
	
	/**
	 * 视图解析器
	 */
	@RequestMapping("/testView.do")
	public String testView()
	{
		return "/front/test_view.jsp";
	}
}
