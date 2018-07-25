package com.bill.mspringboot.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Description: SpringBoot启动类<br/>
 * Date:2018年7月24日 下午1:23:22 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
//@SpringBootApplication 等同于默认的属性的 @Configuration, @EnableAutoConfiguration and @ComponentScan。
@SpringBootApplication(scanBasePackages={
		"com.bill.mspringboot.controller.*",
		"com.bill.mspringboot.service.impl",
		"com.bill.mspringboot.application"})
//@ServletComponentScan结合Filter类的@WebFilter注解，完成过滤器的配置
@ServletComponentScan(basePackages={"com.bill.mspringboot.filter"})
@MapperScan(value={"com.bill.mspringboot.mapper"})
public class ApplicationMain
{
	public static void main(String[] args)
	{
		//启动SpringBoot
		SpringApplication.run(ApplicationMain.class, args);
	}
	
}
