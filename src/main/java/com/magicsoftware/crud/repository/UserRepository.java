package com.magicsoftware.crud.repository;

import com.magicsoftware.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // HQL hibernate query language
    // JPQL Java persistence query language
    Optional<User> findByUsername(String name);
}
