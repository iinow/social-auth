package com.ha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ha.common.Define.PROVIDER;
import com.ha.entity.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
	Optional<UserModel> findByEmail(String email);
	Optional<UserModel> findByEmailAndProvider(String email, PROVIDER provider);
    Boolean existsByEmail(String email);
}
