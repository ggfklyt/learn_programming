package com.nonsuch1.todo.web;

import java.util.List;
import javax.servlet.*;
import java.io.IOException;

public class ToDoServlet extends HttpServlet {
	private ToDoRepository toDoRepository = new InMemoryToDoRepository();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String servletPath = request.getServletPath();
		String view = processRequest(servletPath, request);
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	private String processRequest(String servletPath, HttpServletRequest request) {
	if (servletPath.equals("/all"))	{
		List<ToDoItem> toDoItems = toDoRepository.findAll();
		request.setAttribute("toDoItems", toDoItems);
		return "/jsp/todo-list.jsp";
	} else if (servletPath.equals("/delete")) {
			
	}

	return "/all"
	}
}
