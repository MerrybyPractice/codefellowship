package com.codefellowship.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodefellowshipUserRepository extends JpaRepository<CodefellowshipUser, Long> {
    CodefellowshipUser findByUsername(String username);
}
