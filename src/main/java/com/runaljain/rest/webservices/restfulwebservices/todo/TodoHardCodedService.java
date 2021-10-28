package com.runaljain.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoHardCodedService {


	public static List<Todo> todos = new ArrayList<>();
	
	public static int idCounter = 0;
	
	static{
		todos.add(new Todo(++idCounter, "JohnWick","Learn Java",new Date(),false));
		todos.add(new Todo(++idCounter, "JohnWick","Learn SpringBoot",new Date(),false));
		todos.add(new Todo(++idCounter, "JohnWick","Give Interview",new Date(),false));

	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(long id){
		Todo todo = findById(id);
		if(todo==null) return null;
		todos.remove(todo);
		return todo;
	}
	
	public Todo Save(Todo todo){
			if (todo.getId()<=0){
				todo.setId((long) ++idCounter);
				todos.add(todo);
			}
			else{
				deleteById(todo.getId());
				todos.add(todo);
			}
			return todo;
		}
	
	
	public Todo findById(long id) {
		for(Todo todo: todos){
			if(todo.getId()==id) return todo;
		}
		return null;
	}
}
