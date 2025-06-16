package com.example.ToDoList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDoList.entities.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
