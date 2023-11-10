package com.ranjith.Springboot_Todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String items;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="uid",referencedColumnName = "uid")
    private AppUser users;
}
