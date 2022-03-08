package com.gyanesh.hc.model;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

/**
 * This class is needed for Spring to insert the auditor user id on the records
 * created and updated by Spring Data JPA. Ideally this should return the
 * current logged in user id. Since this project does not use Spring Security, a
 * hard-coded string value is returned instead.
 * 
 * @author gyanesh.sharma
 *
 */
public class AuditorAwareImp implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.ofNullable("Gyanesh");
	}

}
