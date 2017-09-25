package com.arief.spring.services.userService;


import com.arief.spring.entity.User;
import com.arief.spring.services.userDAO.UserRepo;
import com.arief.spring.services.userDAO.UserServiceRepoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements UserServiceRepoDAO {

    @Autowired
    private UserRepo userRepo;


    @Transactional
    @Override
    public void save(User u) {
       userRepo.save(u);
    }


    @Transactional
    @Override
    public List<User> getAll() {
        return (List<User>) userRepo.findAll();
    }

    @Transactional
    @Override
    public void delete(int id) {
       userRepo.delete(id);
    }

    @Transactional
    @Override
    public void updateData(int id, String nama, String alamat) {
       userRepo.updateData(id,nama,alamat);
    }

    @Transactional
    @Override
    public User findOne(int id) {
       return userRepo.findOne(id);
    }

}
