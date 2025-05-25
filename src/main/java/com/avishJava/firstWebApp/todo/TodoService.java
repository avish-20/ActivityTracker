package com.avishJava.firstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo(1, "avish", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "avish", "Learn Azure", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "avish", "GCP", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
}
