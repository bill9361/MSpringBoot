package com.bill.mspringboot.controller.front;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.mspringboot.service.CompanyService;

/**
 * Description: <br/>
 * Date:2018年7月24日 下午1:29:40 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/company")
@Controller
public class CompanyController
{
	@Autowired
	private CompanyService companyService;
	
	/**
	 * 获取所有公司信息
	 * @return
	 */
	@RequestMapping("/getAllCompanys.do")
	@ResponseBody
	public List<Map<String,Object>> getAllCompanys()
	{
		return companyService.getAllCompanys();
	}
	
	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return
	 */
	@RequestMapping("/getCompanysByName.do")
	@ResponseBody
	public List<Map<String,Object>> getCompanysByName(String name)
	{
		return companyService.getCompanysByName(name);
	}
	
	
}
