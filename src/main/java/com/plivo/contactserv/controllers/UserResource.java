package com.plivo.contactserv.controllers;

import com.plivo.contactserv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestMapping(path = "/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Response getUser(){
        return Response.ok().build();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Response getUserById(@PathVariable("id") int id){
        return Response.ok().build();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public Response createUser(){
        return Response.ok().build();
    }
}
