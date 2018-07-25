package com.bill.mspringboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Description: 自定义过滤器<br/>
 * Date:2018年7月25日 上午11:48:05 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@WebFilter(filterName="myFilter",urlPatterns={"/*"})
public class MyFilter implements Filter
{

	@Override
	public void destroy()
	{
		System.out.println("MyFilter....destroy()");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		System.out.println("MyFilter....doFilter()");
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("MyFilter....init()");
	}

}
