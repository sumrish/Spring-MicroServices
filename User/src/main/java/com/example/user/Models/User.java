package com.example.user.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "TEST_USER")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name="TRANSACTION_TIME")
    @Basic
    public java.sql.Timestamp transactionTime;

    @Column(name="TRANSACTION_DATE")
    @Basic
    @Temporal(TemporalType.DATE)
    public java.util.Date transactionDate;

    @Column(name="TRANSACTION_ID")
    public int transactionId;

    @Column(name="USERNAME")
    public String username;

    @Column(name="NAME")
    public String name;

    @Column(name="PHONE")
    public String phone;

    @Column(name="WEBSITE")
    public String website;

    public User() {
    }


    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", transaction_id='" + transactionId + " ' ' ' "+
                ", transaction_time=" + transactionTime +
                ", transaction_date='" + transactionDate + " ' ' ' "+
                ", website='" + website + " ' ' "+
                ", phone=" + phone +
                ", username='" + username + " ' ' ' "+
                ", name='" + name + " ' ' "+
        '}';
    }
}
