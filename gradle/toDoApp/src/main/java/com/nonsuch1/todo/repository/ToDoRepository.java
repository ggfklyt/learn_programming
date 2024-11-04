package com.nonsuch1.todo.repository;

import com.nonsuch1.todo.model.ToDoItem;
import java.util.List;

public interface ToDoRepository {
	List<ToDoItem> findAll();
	ToDoItem findById(Long id);
	Long insert(ToDoItem toDoItem);
	void update(ToDoItem toDoItem);
	void delete(ToDoItem toDoItem);
}
