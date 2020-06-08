package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
