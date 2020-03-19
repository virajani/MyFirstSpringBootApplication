package com.pys.boot.domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_id")
    private Integer id;

    @Column(name="first_name")
    private String fname;

    @Column(name="last_name")
    private String lname;

    @Column(name="age")
    private Integer age;

    @Column(name="email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





}
