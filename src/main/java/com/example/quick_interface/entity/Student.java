package com.example.quick_interface.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    public String id;
    public String age;
    public String email;
    public String phone;
}
