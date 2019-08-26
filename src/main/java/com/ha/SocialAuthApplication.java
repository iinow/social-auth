package com.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@EnableAuthorizationServer
@SpringBootApplication
//@EnableOAuth2Sso
//@EnableOAuth2Client
public class SocialAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialAuthApplication.class, args);
	}
	
	@RestController
	public static class RedirectController {
		
		@GetMapping(path = "/facebook/oauth/redirect")
		public String redirect(
				@RequestParam(name = "code") String code) {
			return "helo";
		}
	}
}
