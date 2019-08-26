package com.ha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ha.entity.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
	Optional<UserModel> findByEmail(String email);
    Boolean existsByEmail(String email);
}
