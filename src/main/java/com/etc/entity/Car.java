package com.etc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Car {
    @Id
    private String cadId;
    private String userId;
    private String dogId;
    private String number;
    private String address;
    private String status;
    private String time;
}
