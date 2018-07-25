package com.bill.mspringboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.bill.mspringboot.entity.Company;

/**
 * 注解的方式
 * Description: 公司Mapper<br/>
 * Date:2018年7月24日 下午1:14:15 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public interface CompanyMapper
{
	/**
	 * 获取所有公司信息
	 * @return
	 */
	@Select("select * from company")
	public List<Map<String,Object>> getAllCompanys();
	
	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return List<Map<String,Object>>
	 */
	//@Select("select * from company where name like concat('%',#{arg0},'%')")
	@Select("select * from company where name like concat('%',#{name},'%')")
	public List<Map<String,Object>> getCompanysByName(String name);
	
	/**
	 * 根据名称模糊查找公司信息
	 * @param name
	 * @return Company
	 */
	@Select("select id,name,type,company_root_id as companyRootId,address_id as addressId,address_detail as addressDetail,leaf,parent_id as parentId,path from company where name like concat('%',#{name},'%')")
	public List<Company> getCompanysByName1(String name);
}
