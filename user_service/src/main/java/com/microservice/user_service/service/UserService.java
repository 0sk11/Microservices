package com.microservice.user_service.service;

import com.microservice.user_service.entity.User;

public interface UserService {
    public User getUser(Long id);
}
