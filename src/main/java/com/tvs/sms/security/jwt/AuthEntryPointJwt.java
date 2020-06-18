package com.tvs.sms.security.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {
	
	
	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest arg0, HttpServletResponse arg1, AuthenticationException arg2)
			throws IOException, ServletException {
		logger.error("Unauthorized error: {}", arg2.getMessage());
		arg1.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");
		
	}

}
