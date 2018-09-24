package com.plivo.contactserv.service;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;

import java.util.List;

public interface ContactService {


    Contact addContact(ContactRequest contactRequest) throws Exception;

    List<Contact> getContacts(String start, String end, String page, String email, String mobile, String firstName, String lastName) throws Exception;

    Contact getContactsById(int id) throws Exception;

    Contact updateContact(ContactRequest contactRequest) throws Exception;

    void deleteContact(int id) throws Exception;
}
