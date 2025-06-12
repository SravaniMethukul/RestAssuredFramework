package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{
	
	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		//once captured then request is executed further and next returns the response
		Response response =ctx.next(requestSpec, responseSpec); 
		logResponse(response);
		return response; //taken to test for assertion
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec) {
		
		logger.info("Base URI: "+requestSpec.getBaseUri());
		logger.info("Resquest Body: "+requestSpec.getBody());
		logger.info("Resquest Header: "+requestSpec.getHeaders());
	
	
	}
	
	public void logResponse(Response response) {
		logger.info("Status code: "+response.getStatusCode());
		logger.info("Response Body: "+response.getBody());
		logger.info("Response Header: "+response.getHeaders());
	}

}
