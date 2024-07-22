package com.alvarezmar.litora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarezmar.litora.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
