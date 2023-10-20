package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.binding.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
