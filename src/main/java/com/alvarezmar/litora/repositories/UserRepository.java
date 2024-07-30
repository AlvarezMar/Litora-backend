package com.alvarezmar.litora.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvarezmar.litora.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
