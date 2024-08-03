package com.datalifebrazil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datalifebrazil.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
