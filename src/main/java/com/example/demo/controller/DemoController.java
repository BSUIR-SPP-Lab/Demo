package com.example.demo.controller;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/")
    public ResponseEntity<List<User>> demo(){
        return new ResponseEntity<>(userDAO.findUsers(), HttpStatus.OK);
    }
}
