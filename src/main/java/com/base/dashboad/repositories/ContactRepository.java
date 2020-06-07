package com.base.dashboad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.dashboad.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
