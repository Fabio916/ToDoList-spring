package com.example.ToDoList.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.entities.Tasks;
import com.example.ToDoList.services.TasksService;

@RestController
@RequestMapping(value = "/tasks")
public class TasksResource {

	@Autowired
	TasksService service;
	
	public ResponseEntity<List<Tasks>> findAll(){
		List<Tasks> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
