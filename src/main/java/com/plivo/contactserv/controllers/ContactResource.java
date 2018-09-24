package com.plivo.contactserv.controllers;

import com.plivo.contactserv.dto.ContactRequest;
import com.plivo.contactserv.entity.Contact;
import com.plivo.contactserv.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<Contact> getContacts(@QueryParam("start") String start,
                                     @QueryParam("end") String end,
                                     @QueryParam("page") String page,
                                     @QueryParam("email") String email,
                                     @QueryParam("mobile") String mobile,
                                     @QueryParam("firstName") String firstName,
                                     @QueryParam("lastName") String lastName) throws Exception {
        return contactService.getContacts(start,end, page, email, mobile, firstName, lastName);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.GET)
    public Contact getContactsById(@PathVariable("id") int id) throws Exception {
        return contactService.getContactsById(id);
    }

    @RequestMapping(path ="/", method = RequestMethod.POST)
    public ResponseEntity addContact(@RequestBody ContactRequest contactRequest) throws Exception {

        try{
            Contact contact = contactService.addContact(contactRequest);
            return ResponseEntity.ok(contact);
        } catch (NoSuchFieldException e){
            return ResponseEntity.status(404).build();
        }

    }

    @RequestMapping(path ="/{id}", method = RequestMethod.PUT)
    public Contact updateContact(@PathVariable("id") int id,
                                 @RequestBody ContactRequest contactRequest) throws Exception {
        return contactService.updateContact(contactRequest);
    }

    @RequestMapping(path ="/{id}", method = RequestMethod.DELETE)
    public Response deleteContact(@PathVariable("id") int id) throws Exception {
        contactService.deleteContact(id);
        return Response.ok().build();
    }
}
