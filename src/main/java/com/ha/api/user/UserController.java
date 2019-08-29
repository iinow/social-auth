package com.ha.api.user;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {

	@GetMapping(path = "")
	public Principal home(Principal principal) {
		return principal;
	}
}
