package com.plivo.contactserv.repositories.impl;

import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.repositories.ContactRepositoryCustom;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ContactRepositoryCustomImpl implements ContactRepositoryCustom {


    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Contact> findByEmail(String email) {
        Query query = entityManager.createNativeQuery("SELECT contact.* FROM Contact as contact " +
                "WHERE contact.primaryEmail LIKE ?", Contact.class);
        query.setParameter(1, email + "%");
        List<Contact> contactList = query.getResultList();
        return contactList;
    }

    @Override
    public List<Contact> findByMobileNo(String mobileNo) {
        Query query = entityManager.createNativeQuery("SELECT contact.* FROM Contact as contact " +
                "WHERE contact.primaryMobile LIKE ?", Contact.class);
        query.setParameter(1, mobileNo + "%");
        List<Contact> contactList = query.getResultList();
        return contactList;
    }
}
