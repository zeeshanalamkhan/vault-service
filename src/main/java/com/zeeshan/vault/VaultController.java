package com.zeeshan.vault;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultController {
	
	@Autowired
	public Environment env;

	@GetMapping("/cred")
	public List<String> getCredentials() {
		List<String> creds = new ArrayList<String>();
		creds.add(env.getProperty("spring.datasource.username"));
		creds.add(env.getProperty("spring.datasource.password"));
		return creds;
	}
}
