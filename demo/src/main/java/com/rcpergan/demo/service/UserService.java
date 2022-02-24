package com.rcpergan.demo.service;

import com.rcpergan.demo.repository.IUserRepository;
import com.rcpergan.demo.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    public void save(User user) {
        iUserRepository.save(user);
    }

    public List<User> findAll() {
        return iUserRepository.findAll();
    }
}
