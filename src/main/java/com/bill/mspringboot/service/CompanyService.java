package com.bill.mspringboot.service;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date:2018年7月24日 下午1:19:11 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */

public interface CompanyService
{

	/**
	 * 获取所有公司信息
	 * @return
	 */
	List<Map<String, Object>> getAllCompanys();

	/**
	 * 根据name模糊查找公司信息
	 * @param name
	 * @return
	 */
	List<Map<String, Object>> getCompanysByName(String name);

}