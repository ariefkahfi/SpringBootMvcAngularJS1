package com.arief.spring.services.userDAO;

import com.arief.spring.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {


    @Transactional
    @Modifying
    @Query("update User  u set u.nama = :nama , u.alamat = :alamat where u.id = :id")
    void updateData(@Param("id")int id , @Param("nama")String nama , @Param("alamat")String alamat);
}
