package com.nikhil.spring.react.maven.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author nbilgi
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.nikhil.spring.react.maven.jar"})
public class SpringReactMavenJar extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactMavenJar.class);
	}
}
