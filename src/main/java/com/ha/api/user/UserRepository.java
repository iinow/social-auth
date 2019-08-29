package com.ha.api.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ha.common.Define.PROVIDER;
import com.ha.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
	Optional<User> findByEmailAndProvider(String email, PROVIDER provider);
    Boolean existsByEmail(String email);
}
