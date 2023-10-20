package com.tcs.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.binding.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
