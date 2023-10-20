package com.tcs.db1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.db1.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
