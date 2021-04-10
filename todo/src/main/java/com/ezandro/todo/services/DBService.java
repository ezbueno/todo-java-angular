package com.ezandro.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezandro.todo.domain.Todo;
import com.ezandro.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciarBaseDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);

		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal",
				sdf.parse("22/03/2021"), true);

		Todo t3 = new Todo(null, "Exercícios", "Praticar exercícios físicos",
				sdf.parse("21/03/2021"), false);

		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
				sdf.parse("27/03/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
