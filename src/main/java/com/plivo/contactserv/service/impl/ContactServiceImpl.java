package com.plivo.contactserv.service.impl;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.entity.User;
import com.plivo.contactserv.repositories.ContactRepository;
import com.plivo.contactserv.service.ContactService;
import com.plivo.contactserv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private UserService userService;

    @Override
    public Contact addContact(ContactRequest contactRequest) throws Exception {
        if(Objects.nonNull(contactRequest.getUserId())) {

            User user = userService.getUserById(contactRequest.getUserId());

            if(user.getId() == null){
                throw new NoSuchFieldException("user id is null");
            }

            Contact contact = getContact(contactRequest);
            return contactRepository.save(contact);

        } else {
            throw new NoSuchFieldException("user id is null");
        }



    }

    private Contact getContact(ContactRequest contactRequest) {
        Contact contact = new Contact();
        User user = new User();
        user.setId(contactRequest.getUserId());
        contact.setUser(user);
        contact.setFirstName(contactRequest.getFirstName());
        contact.setLastName(contactRequest.getLastName());
        contact.setPrimaryEmail(contactRequest.getPrimaryEmail());
        contact.setPrimaryMobile(contactRequest.getPrimaryMobile());
        return contact;
    }

    @Override
    public List<Contact> getContacts(String start, String end, String page, String email, String mobile, String firstName, String lastName) throws Exception{
        if(Objects.nonNull(email)){
            return contactRepository.findByEmail(email);
        }

        if(Objects.nonNull(mobile)){
            return contactRepository.findByMobileNo(mobile);
        }
        if(Objects.nonNull(firstName)){
            return contactRepository.findByFirstName(firstName);
        }

        if(Objects.nonNull(lastName)){
            return contactRepository.findByLastName(lastName);
        }

        return contactRepository.findAll();
    }

    @Override
    public Contact getContactsById(int id) throws Exception{

            Optional<Contact> contact = contactRepository.findById(id);
            if(contact.isPresent()){
                return contact.get();
            }
        return new Contact();

    }

    @Override
    public Contact updateContact(ContactRequest contactRequest) throws Exception{

        Contact contact = getContact(contactRequest);
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(int id) throws Exception {
        contactRepository.deleteById(id);
    }

}
