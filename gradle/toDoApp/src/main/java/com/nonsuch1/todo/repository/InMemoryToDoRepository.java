package com.nonsuch1.todo.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import com.nonsuch1.todo.model.ToDoItem;

public class InMemoryToDoRepository implements ToDoRepository {
	private AtomicLong currentId = new AtomicLong();
	private ConcurrentHashMap<Long, ToDoItem> toDos = new ConcurrentHashMap<Long, ToDoItem>();

	@Override
	public ToDoItem findById(Long id) { return toDos.get(id); }

	@Override
	public Long insert(ToDoItem toDoItem) {
		Long id = currentId.incrementAndGet();
		toDoItem.setId(id);
		toDos.putIfAbsent(id, toDoItem);
		return id;
	}

	@Override
	public void update(ToDoItem toDoItem) {
		toDos.replace(toDoItem.getId(), toDoItem);
	}

	@Override
	public void delete(ToDoItem toDoItem) {
		toDos.remove(toDoItem.getId());
	}

	@Override
	public List<ToDoItem> findAll() {
		List<ToDoItem> toDoItems = new ArrayList<ToDoItem>(toDos.values());
		Collections.sort(toDoItems);
		return toDoItems;
	}
}
