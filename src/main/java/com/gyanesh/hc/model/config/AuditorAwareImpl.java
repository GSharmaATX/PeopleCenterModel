package com.gyanesh.hc.model.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;

/**
 * This class is used by Spring to get current logged-in user. This information
 * is then used to update last-updated-by user and created-by user fields on the
 * database tables.
 * 
 * @author gyanesh.sharma
 *
 */
public class AuditorAwareImpl implements AuditorAware<String> {

	// Get method returns cognito user name from the JWT token. 
	@Override
	public Optional<String> getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Jwt principal = (Jwt) authentication.getPrincipal();
		String currentUserName = principal.getClaimAsString("cognito:username");

		return Optional.ofNullable(currentUserName);
	}

}
