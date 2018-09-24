package com.plivo.contactserv.repositories;

import com.plivo.contactserv.entity.Contact;

import java.util.List;

public interface ContactRepositoryCustom {

    List<Contact> findByEmail(String email) throws Exception;
    List<Contact> findByMobileNo(String mobileNo) throws Exception;
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByLastName(String lastName);
}
