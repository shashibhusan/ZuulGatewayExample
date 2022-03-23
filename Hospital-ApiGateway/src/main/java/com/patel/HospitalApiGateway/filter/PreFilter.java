package com.patel.HospitalApiGateway.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter {

	private static Logger log=LoggerFactory.getLogger(PreFilter.class);
	@Override
	public boolean shouldFilter() {
		log.info("PreFilter============111==================>>>");
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletResponse response=RequestContext.getCurrentContext().getResponse();
		log.info("PreFilter "+String.format("response status is %d", response.getStatus()));
		return null;
	}

	@Override
	public String filterType() {
		log.info("PreFilter============222==================>>>");
		return "PreFilter";
	}

	@Override
	public int filterOrder() {
		log.info("PreFilter============333==================>>>");
		return 1;
	}

}
