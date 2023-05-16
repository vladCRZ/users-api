package com.infomedia.usersapi.repository;

import com.infomedia.usersapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}