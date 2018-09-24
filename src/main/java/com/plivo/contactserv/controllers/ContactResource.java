package com.plivo.contactserv.controllers;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@RequestMapping(path = "/contact")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

    @Autowired
    private ContactService contactService;

    @RequestMapping(path ="/", method = RequestMethod.GET)
    public List<Contact> getContacts(@QueryParam("start") int start,
                                     @QueryParam("end") int end){
        return contactService.getContacts(start,end);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.GET)
    public Contact getContactsById(@PathVariable("id") int id) {
        return contactService.getContactsById(id);
    }

    @RequestMapping(path ="/", method = RequestMethod.POST)
    public Contact addContact(ContactRequest contactRequest){

       return contactService.addContact(contactRequest);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.PUT)
    public Contact updateContact(@PathVariable("id") int id,
                                 ContactRequest contactRequest){
        return contactService.updateContact(contactRequest);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.DELETE)
    public Response deleteContact(@PathVariable("id") int id){
        contactService.deleteContact(id);
        return Response.ok().build();
    }
}
