package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
