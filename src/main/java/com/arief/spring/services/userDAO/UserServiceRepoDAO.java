package com.arief.spring.services.userDAO;

import com.arief.spring.entity.User;

import java.util.List;

public interface UserServiceRepoDAO {
    void save(User u);
    List<User> getAll();
    void delete(int id);
    void updateData(int id ,String nama ,String alamat);
    User findOne(int id);
}
