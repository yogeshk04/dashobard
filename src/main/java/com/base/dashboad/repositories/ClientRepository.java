package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
