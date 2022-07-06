package by.htp.ex.controller.impl;

import java.io.IOException;

import by.htp.ex.bean.User;
import by.htp.ex.controller.Command;
import by.htp.ex.customers.UserCards;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoAuthorization implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = UserCards.getUserCard((request.getParameter("login")));
		if (user == null || !user.getPassword().equals(request.getParameter("password"))) {
			response.getWriter().println("WRONG EMAIL OR PASSWORD");
		}

		else {
			request.getRequestDispatcher("/WEB-INF/jsp/authorizedMainPage.jsp").forward(request, response);
		}
	}
}
