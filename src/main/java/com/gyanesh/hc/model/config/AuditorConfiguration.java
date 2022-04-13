package com.gyanesh.hc.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * This class is used by Spring Data JPA to enable JPA auditing.
 * 
 * @author gyanesh.sharma
 *
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorRef")
public class AuditorConfiguration {

	@Bean
	public AuditorAwareImpl auditorRef() {
		return new AuditorAwareImpl();
	}
}