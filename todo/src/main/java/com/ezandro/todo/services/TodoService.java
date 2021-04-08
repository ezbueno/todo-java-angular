package com.ezandro.todo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezandro.todo.domain.Todo;
import com.ezandro.todo.repositories.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public Todo findById(Integer id) {
		Optional<Todo> obj = todoRepository.findById(id);
		return obj.orElseThrow(null);
	}
	
	
}
