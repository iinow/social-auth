package com.ha.repository;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

public class LocalClientRegistrationRepository implements ClientRegistrationRepository {

	@Override
	public ClientRegistration findByRegistrationId(String registrationId) {
		return null;
	}
}
