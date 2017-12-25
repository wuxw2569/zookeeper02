package com.test.zookeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.zookeeper.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value ="select t.id,t.name,t.age from user t where t.id=?1", nativeQuery = true)
	User findOne(long id);
}
