package com.bill.mspringboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 拦截器(拦截器主要拦Controller,过滤器主要是过滤Jsp,js等)<br/>
 * Date:2018年7月25日 上午10:45:13 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public class MyInterceptor implements HandlerInterceptor
{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception)
			throws Exception
	{
		System.out.println("MyInterceptor....afterCompletion()");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView)
			throws Exception
	{
		System.out.println("MyInterceptor....postHandle()");		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception
	{
		System.out.println("MyInterceptor....preHandle()");	
		return true;
	}
	
}
