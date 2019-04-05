/**
 * 
 */
package com.cacheinfotech.hshrc;

/**
 * <code>StartWebApplication</code> This module is used for Tomcat deployement
 * @author vipulvj
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StartWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StartWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("sdsdjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		return builder.sources(StartWebApplication.class);
	}
}
