package com.example.ToDoList.services.exceptions;

public class TaskWithoutUserException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TaskWithoutUserException(String msg) {
		super(msg);
	}
}
