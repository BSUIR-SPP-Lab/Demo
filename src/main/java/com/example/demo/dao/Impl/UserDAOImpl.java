package com.example.demo.dao.Impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.rowMapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findUsers() {
        return jdbcTemplate.query("SELECT `id`,`login` FROM `user`", new UserRowMapper());
    }
}
