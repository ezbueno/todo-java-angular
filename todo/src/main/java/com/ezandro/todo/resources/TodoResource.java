package com.ezandro.todo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezandro.todo.domain.Todo;
import com.ezandro.todo.services.TodoService;

@RestController
@RequestMapping(value = "/todos")
public class TodoResource {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id) {
		Todo obj = todoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
