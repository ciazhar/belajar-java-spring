package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
  Users.java: It is an entity class with setter and getter methods.
  class ini menggunakan hibenate framework
*/

@Entity//@Entity menandakan bahwa class ini merupakan class entity
@Table(name = "users")///nama tabel pada database
public class Users {
    @Id///@Id menandakan value ini merupakan primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//@GeneratedValue dipasangkan bersama @Id, menandakan primary digenerate otomatis oleh database
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "email")
    private String email;

    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
