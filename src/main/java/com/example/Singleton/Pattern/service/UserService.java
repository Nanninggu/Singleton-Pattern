package com.example.Singleton.Pattern.service;

import com.example.Singleton.Pattern.dto.User;
import com.example.Singleton.Pattern.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 싱글톤으로 구현된 클래스
@Service
public class UserService {
    private static UserService instance = null;

    @Autowired
    private UserMapper userMapper;

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public List<User> findByName(String id) {
        return userMapper.findByName(id);
    }

}
