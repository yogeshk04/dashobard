package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
