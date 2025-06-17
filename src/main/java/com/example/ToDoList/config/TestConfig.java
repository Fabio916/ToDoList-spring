package com.example.ToDoList.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.ToDoList.entities.Tasks;
import com.example.ToDoList.entities.User;
import com.example.ToDoList.repositories.TasksRepository;
import com.example.ToDoList.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TasksRepository tasksRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
