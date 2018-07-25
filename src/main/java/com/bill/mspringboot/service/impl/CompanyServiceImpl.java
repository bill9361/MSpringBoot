package com.bill.mspringboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.mspringboot.entity.Company;
import com.bill.mspringboot.mapper.CompanyMapper;
import com.bill.mspringboot.service.CompanyService;

/**
 * Description: <br/>
 * Date:2018年7月24日 下午1:16:58 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Service
public class CompanyServiceImpl implements CompanyService
{
	@Autowired
	private CompanyMapper companyMapper;
	
	/**
	 * 查询所有公司信息
	 */
	@Override
	public List<Map<String,Object>> getAllCompanys()
	{
		return companyMapper.getAllCompanys();
	}
	
	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return
	 */
	@Override
	public List<Map<String,Object>> getCompanysByName(String name)
	{
		return companyMapper.getCompanysByName(name);
	}

	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return
	 */
	@Override
	public List<Company> getCompanysByName1(String name)
	{
		return companyMapper.getCompanysByName1(name);
	}
}
