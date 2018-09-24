package com.plivo.contactserv.service.impl;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.repositories.ContactRepository;
import com.plivo.contactserv.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import java.util.List;

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
        contact.setPrimaryemail(contactRequest.getPrimaryEmail());
        contact.setPrimaryMobile(contactRequest.getPrimaryMobileNo());
        return contact;
    }

    @Override
    public List<Contact> getContacts(int start, int end) {
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
