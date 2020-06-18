package com.tvs.sms.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tvs.sms.model.ERole;
import com.tvs.sms.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Optional<Role> findByName(ERole name);

}
