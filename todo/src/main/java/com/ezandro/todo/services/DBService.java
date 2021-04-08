package com.ezandro.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezandro.todo.domain.Todo;
import com.ezandro.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;

	public void instanciarBaseDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1));
	}
}
