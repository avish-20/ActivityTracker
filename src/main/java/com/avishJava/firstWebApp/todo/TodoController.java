package com.avishJava.firstWebApp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
// /list-todos
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
	super();
	this.todoService = todoService;
}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todo = todoService.findByUsername("avish");
		model.put("todoList", todo);
		return "ListTodos";
	}
}
