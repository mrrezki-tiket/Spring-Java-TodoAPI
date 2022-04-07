package com.tiket.springbootmongodb.service;

import com.tiket.springbootmongodb.exception.TodoCollectionException;
import com.tiket.springbootmongodb.model.TodoDTO;

import javax.validation.ConstraintViolationException;
import java.util.List;

public interface TodoService {
    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;

    public List<TodoDTO> getAllTodos();
}
