package com.ranjith.Springboot_Todo.service;

import com.ranjith.Springboot_Todo.model.AppUser;
import com.ranjith.Springboot_Todo.model.Todo;
import com.ranjith.Springboot_Todo.repository.AppUserRepository;
import com.ranjith.Springboot_Todo.repository.TodoRepository;
import com.ranjith.Springboot_Todo.request.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private AppUserRepository appUserRepository;

    public List<Todo> findAllTodo(int userid) {

        return todoRepository.findAll()
                .stream()
                .filter(todo -> todo.getUsers().getUid() == userid)
                .collect(Collectors.toList());
    }


    public List<Todo> addTodo(TodoRequest todo) {
        Todo originalTodo = new Todo();
        originalTodo.setItems(todo.getItems());
        AppUser user = appUserRepository.findById(todo.getUid()).get();
        originalTodo.setUsers(user);
        todoRepository.save(originalTodo);
        return findAllTodo(todo.getUid());
    }

    public List<Todo> updateTodo(TodoRequest todo) {
        Todo originalTodo = new Todo();
        originalTodo.setItems(todo.getItems());
        AppUser user = appUserRepository.findById(todo.getUid()).get();
        originalTodo.setUsers(user);
        todoRepository.save(originalTodo);
        return findAllTodo(todo.getUid());
    }

    public List<Todo> deleteTodo(Integer id) {
        int userId = todoRepository.findById(id).get().getUsers().getUid();
        todoRepository.deleteById(id);
        return findAllTodo(userId);
    }
}
