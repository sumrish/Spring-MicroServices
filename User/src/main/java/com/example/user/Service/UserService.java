package com.example.user.Service;


import com.example.user.DB.IUserRepository;
import com.example.user.Models.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements IUserService {

    @Autowired
    IUserRepository iUserRepository;
    Calendar calendar;
    Date date;
    String baseUrl = "https://jsonplaceholder.typicode.com/";

    @Override
    public void insertUser(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void updateUser(String website , String phone , int id) {
        List<User> user = iUserRepository.findByTransactionId(id);
        if(user != null) {
            user.get(0).website = website;
            user.get(0).phone = phone;
            iUserRepository.save(user.get(0));
        }
    }

    @Override
    public User getUser(int id) {
        String url = baseUrl + "users/{id}";
        Map<String, Integer> uriVariables = new HashMap<String, Integer>();
        uriVariables.put("id", id );

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> response = restTemplate
                .exchange(url, HttpMethod.GET, null, User.class, uriVariables);

        calendar = Calendar.getInstance();
        date = calendar.getTime();
        User user = new User();
        user.transactionId = response.getBody().id;
        user.username =  response.getBody().username;
        user.phone =  response.getBody().phone;
        user.name =  response.getBody().name;
        user.website =  response.getBody().website;
        user.transactionDate =  date ;
        user.transactionTime =  new Timestamp(calendar.getTimeInMillis()) ;
        return user;
    }

    @Override
    public List<User> findUser(int id) {
        List<User> user = iUserRepository.findByTransactionId(id);
        return  (user);
    }
}
