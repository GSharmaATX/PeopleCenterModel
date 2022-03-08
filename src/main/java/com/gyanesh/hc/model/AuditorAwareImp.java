package com.gyanesh.hc.model;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImp implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.ofNullable("Gyanesh");
	}

}
