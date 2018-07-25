package com.bill.mspringboot.controller.front;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.mspringboot.entity.Company;
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
	

	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return
	 */
	@RequestMapping("/getCompanysByName1.do")
	@ResponseBody
	public List<Company> getCompanysByName1(String name)
	{
		System.out.println("CompanyController....getCompanysByName1()");
		List<Company> companyList = companyService.getCompanysByName1(name);
		System.out.println(companyList);
		return companyList;
	}
}
