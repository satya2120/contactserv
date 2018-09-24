package com.plivo.contactserv.service;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;

import java.util.List;

public interface ContactService {


    Contact addContact(ContactRequest contactRequest);

    List<Contact> getContacts(int start, int end, int page, String email, String mobile);

    Contact getContactsById(int id);

    Contact updateContact(ContactRequest contactRequest);

    void deleteContact(int id);
}
