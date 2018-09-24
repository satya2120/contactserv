package com.plivo.contactserv.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping(path = "/sample")
public class SampleResource {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Response sample(){
        return Response.ok().build();
    }
}
