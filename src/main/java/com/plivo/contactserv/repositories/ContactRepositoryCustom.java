package com.plivo.contactserv.repositories;

import com.plivo.contactserv.entity.Contact;

import java.util.List;

public interface ContactRepositoryCustom {

    List<Contact> findByEmail(String email);
    List<Contact> findByMobileNo(String mobileNo);
}
