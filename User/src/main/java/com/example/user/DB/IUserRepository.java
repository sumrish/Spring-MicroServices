package com.example.user.DB;

import com.example.user.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    List<User> findByTransactionId(int transaction_id);
}
