package com.example.user.Service;

import com.example.user.Models.User;

import java.util.List;

public interface IUserService {

    public void insertUser(User user);

    public void updateUser(String website , String phone, int id);

    public User getUser(int id);

    public List<User> findUser(int id);

}
