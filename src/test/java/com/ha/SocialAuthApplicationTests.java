package com.ha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SocialAuthApplicationTests {

	@Test
	public void contextLoads() {
		ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
		resource.setUsername("guest");
		
		DefaultOAuth2ClientContext context = new DefaultOAuth2ClientContext();
		
		OAuth2RestTemplate template = new OAuth2RestTemplate(resource, context);
		
		
	}
	
	public Object ss(String ee) {
		new RuntimeException();
		if(ee == null)
			throw new HaException();
		return null;
	}

	@Test
	public void post() {
		RestTemplate template = new RestTemplate();
//		template.exchange(requestEntity, responseType)
	}
}
