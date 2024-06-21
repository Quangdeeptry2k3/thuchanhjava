package baitapjava.example.btthjava.service;

import baitapjava.example.btthjava.entity.User;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);
    void save(User user);
}
