package com.example.ToDoList.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.entities.Tasks;
import com.example.ToDoList.services.TasksService;

@RestController
@RequestMapping(value = "/tasks")
public class TasksResource {

	@Autowired
	TasksService service;
	
	@GetMapping
	public ResponseEntity<List<Tasks>> findAll(){
		List<Tasks> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Tasks> update(@RequestBody Tasks task, @PathVariable Long id) {
		task = service.update(task, id);
		return ResponseEntity.ok().body(task);
	}
}
