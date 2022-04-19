package com.example.album.Models;

import javax.persistence.*;

@Entity
@Table(name = "TEST_ALBUM")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name="USERID")
    public String userId;

    @Column(name="TITLE")
    public String title;

    @Column(name="TRANSACTION_ID")
    public int transactionId;

    public Album() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", transaction_id='" + transactionId + " ' ' ' "+
                ", userId='" + userId + " ' ' ' "+
                ", title='" + title + " ' ' "+
        '}';
    }
}
