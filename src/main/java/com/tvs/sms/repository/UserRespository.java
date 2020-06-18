package com.tvs.sms.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tvs.sms.model.User;

public interface UserRespository extends MongoRepository<User, String> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
