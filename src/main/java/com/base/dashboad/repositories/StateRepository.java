package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
