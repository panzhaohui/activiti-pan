package com.service.activiti7.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-25T03:52:11.453Z")

@RestSchema(schemaId = "activiti7")
@RequestMapping(path = "/activiti7", produces = MediaType.APPLICATION_JSON)
public class Activiti7Impl {

    @Autowired
    private Activiti7Delegate userActiviti7Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userActiviti7Delegate.helloworld(name);
    }

}
