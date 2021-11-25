package com.microservice.contact_service.service;

import entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsofUser(Long userId);
}
