package com.plivo.contactserv.service.impl;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.repositories.ContactRepository;
import com.plivo.contactserv.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact addContact(ContactRequest contactRequest) {
        Contact contact = getContact(contactRequest);
        return contactRepository.save(contact);

    }

    private Contact getContact(ContactRequest contactRequest) {
        Contact contact = new Contact();
        contact.setFirstName(contactRequest.getFirstName());
        contact.setLastName(contactRequest.getLastName());
        contact.setPrimaryEmail(contactRequest.getPrimaryEmail());
        contact.setPrimaryMobile(contactRequest.getPrimaryMobile());
        return contact;
    }

    @Override
    public List<Contact> getContacts(int start, int end, int page, String email, String mobile) {
        if(Objects.nonNull(email)){
            return contactRepository.findByEmail(email);
        }

        if(Objects.nonNull(mobile)){
            return contactRepository.findByMobileNo(mobile);
        }

        return contactRepository.findAll();
    }

    @Override
    public Contact getContactsById(int id) {
        return contactRepository.getOne(id);
    }

    @Override
    public Contact updateContact(ContactRequest contactRequest) {

        Contact contact = getContact(contactRequest);
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(int id) {
        contactRepository.deleteById(id);
    }

}
