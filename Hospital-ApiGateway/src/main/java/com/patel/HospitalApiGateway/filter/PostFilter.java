package com.patel.HospitalApiGateway.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter extends ZuulFilter {

	private static Logger log=LoggerFactory.getLogger(PostFilter.class);
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletResponse response=RequestContext.getCurrentContext().getResponse();
		log.info("PostFilter "+String.format("response status is %d", response.getStatus()));
		return null;
	}

	@Override
	public String filterType() {
		return "PostFilter";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
