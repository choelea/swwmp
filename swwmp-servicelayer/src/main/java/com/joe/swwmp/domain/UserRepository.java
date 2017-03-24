package com.joe.swwmp.domain;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> ,JpaSpecificationExecutor<User>{
	
	
	//User findByEmail(String email);
	User findByUsername(String username);
}
