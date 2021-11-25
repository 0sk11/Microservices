package com.microservice.contact_service.service;

import entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"shubham@gmail.com","Shubham",1311L),
            new Contact(2L,"shub@gmail.com","Shub",1311L),
            new Contact(3L,"rohan@gmail.com","Rohan",1312L),
            new Contact(4L,"sameer@gmail.com","Sameer",1314L)
    );

    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream()
                .filter(contact->contact.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
