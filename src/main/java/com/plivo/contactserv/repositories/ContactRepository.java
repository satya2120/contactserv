package com.plivo.contactserv.repositories;

import com.plivo.contactserv.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>, ContactRepositoryCustom {
}
