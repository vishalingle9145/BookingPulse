package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entities.Role;
import com.app.entities.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUserById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return userDao.save(user);
    }

    public User updateUser(User user) {
        return userDao.save(user);
    }

    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }

    public List<User> getUsersByFirstName(String firstName) {
        return userDao.findByFirstName(firstName);
    }

    public List<User> getUsersByLastName(String lastName) {
        return userDao.findByLastName(lastName);
    }

    public User getUserByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public List<User> getUsersByRole(Role role) {
        return userDao.findByRole(role);
    }

    public List<User> getUsersByFirstNameAndLastName(String firstName, String lastName) {
        return userDao.findByFirstNameAndLastName(firstName, lastName);
    }

    public boolean existsByEmail(String email) {
        return userDao.existsByEmail(email);
    }

    
}
