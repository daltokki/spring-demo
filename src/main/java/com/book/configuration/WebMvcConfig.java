package com.book.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/book/search-main");
		registry.addViewController("/home").setViewName("/book/search-main");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/login/register").setViewName("/login/register");
		registry.addViewController("/login/forgot-password").setViewName("/login/forgot-password");
	}
}
