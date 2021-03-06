package com.easy.live.streaming.gateway.intergration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;

public class ApplicationDestroy implements DisposableBean {
	
	Logger logger  = LoggerFactory.getLogger(ApplicationDestroy.class);
	
	@Override
	public void destroy() throws Exception {
		logger.info("System [Config] destroy");
	}
}
