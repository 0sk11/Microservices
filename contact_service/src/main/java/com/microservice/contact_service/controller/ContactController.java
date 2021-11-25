package com.microservice.contact_service.controller;

import com.microservice.contact_service.service.ContactService;
import entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @RequestMapping("/user/{userId}")
    public List<Contact> getContantcs(@PathVariable("userId") Long userId){
        return this.contactService.getContactsofUser(userId);
    }
}
