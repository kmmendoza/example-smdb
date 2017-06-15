package com.examplesmdb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.examplesmdb.dtos.UserDTO;
import com.examplesmdb.repositories.impl.UserRepositoryImpl;

@ComponentScan(basePackages = "com.examplesmdb")
@Component
public class ExampleAuthenticationManager implements AuthenticationManager {

	@Autowired
	private UserRepositoryImpl userRepository;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getPrincipal() + "";
		String password = authentication.getCredentials() + "";	
		
		try {
			UserDTO user = userRepository.findUserForLogin(username,null,password);
			if (user == null) {
				throw new BadCredentialsException("bad credentials");
			}
		} catch (Exception e) {
			throw new AuthenticationServiceException(e.getMessage());
		}

		// Add roles here like this List<Right> userRights =
		// rightRepo.getUserRights(username);
		//return new UsernamePasswordAuthenticationToken(username, password);
		// userRights.stream().map(x -> new
		// SimpleGrantedAuthority(x.getName())).collect(Collectors.toList())
		return new UsernamePasswordAuthenticationToken(username, password);
	}

}
