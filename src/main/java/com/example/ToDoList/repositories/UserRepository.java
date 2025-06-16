package com.example.ToDoList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDoList.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
