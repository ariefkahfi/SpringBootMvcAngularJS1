package com.arief.spring.api;

import com.arief.spring.entity.User;
import com.arief.spring.services.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiMapping {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user-u",method = RequestMethod.POST,produces = {MediaType.TEXT_HTML_VALUE})
    public String updateApi(@RequestBody User u){

     userService.updateData(u.getId(),u.getNama(),u.getAlamat());

     return "Update data berhasil ! , <a href='/arief/list/user'>List User</a>";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST,produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity save(@RequestBody User u){
        try{
           userService.save(u);
           return new ResponseEntity<String>("Data berhasil dimasukkan ke dalam database",HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="/user/{id}",method = RequestMethod.GET,produces = {MediaType.TEXT_HTML_VALUE})
    public String delete(@PathVariable int id){
        userService.delete(id);
        return "Delete data done ! , <a href= '/arief/user/list'>Back to List Page</a>";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> getAllJsonValue(){
       return userService.getAll();
    }



}
