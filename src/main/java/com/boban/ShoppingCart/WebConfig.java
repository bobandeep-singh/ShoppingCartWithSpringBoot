package com.boban.ShoppingCart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.boban.ShoppingCart.constants.UrlPathConstants;
import com.boban.ShoppingCart.constants.ViewNameConstants;

/*
Normally you would add @EnableWebMvc for a Spring MVC app,
but Spring Boot adds it automatically when it sees spring-webmvc on the classpath.
This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	/**
	 * Configure simple automated controllers pre-configured with the response
	 * status code and/or a view to render the response body. This is useful in
	 * cases where there is no need for custom controller logic -- e.g. render a
	 * home page, perform simple site URL redirects, return a 404 status with
	 * HTML content, a 204 with no content, and more.
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController(UrlPathConstants.ROOT_PATH).setViewName(ViewNameConstants.ROOT_VIEW);
	}

}
