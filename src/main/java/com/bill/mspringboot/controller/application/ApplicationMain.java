package com.bill.mspringboot.controller.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: SpringBoot启动类<br/>
 * Date:2018年7月24日 下午1:23:22 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.bill.mspringboot.controller.*","com.bill.mspringboot.service.impl"})
@MapperScan(value={"com.bill.mspringboot.mapper"})
public class ApplicationMain
{
	public static void main(String[] args)
	{
		//启动SpringBoot
		SpringApplication.run(ApplicationMain.class, args);
	}
}
