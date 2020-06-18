package com.tvs.sms.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tvs.sms.model.User;
import com.tvs.sms.repository.UserRespository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRespository userRespository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRespository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

	
		return UserDetailsImpl.build(user);
	}

}
