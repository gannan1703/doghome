package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="order")
@Data
public class Order {
    @Id
    private String orderid;
    private String carid;
    private int account;
    private String time;
    private String state;
    private String status;
    @OneToOne
    @JoinColumn(name = "carid")
    private List<Car> list;
}
