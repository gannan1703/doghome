package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
@Data
public class User {//基本信息
    @Id
    private String userId;
    private String userName;
    private String password;
    private String tel;
    private int money;
    private String admin;
    private String address;

    @OneToMany
    @JoinColumn(name="userid")
    private List<Order> list;
}
