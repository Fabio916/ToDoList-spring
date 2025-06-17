package com.example.ToDoList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDoList.entities.Tasks;
import com.example.ToDoList.repositories.TasksRepository;

@Service
public class TasksService {

	@Autowired
	private TasksRepository tasksRepository;
	
	public List<Tasks> findAll() {
		return tasksRepository.findAll();
	}
	
	public void delete(Long id) {
		tasksRepository.deleteById(id);
	}
	
	public Tasks update(Tasks obj, Long id) {
		Tasks updateTask = tasksRepository.getReferenceById(id);
		updateData(updateTask, obj);
		return tasksRepository.save(updateTask);
	}

	private void updateData(Tasks updateTask, Tasks obj) {
		updateTask.setDescription(obj.getDescription());
	}
}
