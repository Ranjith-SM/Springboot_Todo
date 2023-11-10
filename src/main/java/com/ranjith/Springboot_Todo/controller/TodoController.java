package com.ranjith.Springboot_Todo.controller;

import com.ranjith.Springboot_Todo.model.AppUser;
import com.ranjith.Springboot_Todo.model.Todo;
import com.ranjith.Springboot_Todo.request.TodoRequest;
import com.ranjith.Springboot_Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;



    @GetMapping("/all/{userid}")
    public List<Todo> getAllTodos(@PathVariable int userid) {

        return todoService.findAllTodo(userid);
    }

    @PostMapping
    public List<Todo> addTodo(@RequestBody TodoRequest todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping
    public List<Todo> updateTodo(@RequestBody TodoRequest todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public List<Todo> deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }

}
