package by.htp.ex.controller.impl;

import java.io.IOException;

import by.htp.ex.bean.User;
import by.htp.ex.controller.Command;
import by.htp.ex.customers.UserCards;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoRegistration implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setSurname(request.getParameter("surname"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setBirthday(request.getParameter("birthday"));
		UserCards.addUserCard(user.getEmail(), user);
		request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(request, response);

	}

}
