package com.bill.mspringboot.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: <br/>
 * Date:2018年7月24日 下午2:05:03 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Controller
public class HomeController
{
	
	/**
	 * 配置默认访问首页
	 * @return
	 */
	@RequestMapping("/")
	public String toIndex()
	{
		return "redirect:index.jsp";
	}
}
