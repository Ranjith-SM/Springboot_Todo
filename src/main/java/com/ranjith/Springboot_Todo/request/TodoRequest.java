package com.ranjith.Springboot_Todo.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {

    private int id;

    private String items;

    private int uid;
}
