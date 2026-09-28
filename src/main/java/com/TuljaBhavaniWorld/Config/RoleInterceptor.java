package com.TuljaBhavaniWorld.Config;

import org.springframework.web.servlet.HandlerInterceptor;

import com.TuljaBhavaniWorld.Entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RoleInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession(false);

		// No login session

		if (session == null || session.getAttribute("user") == null) {

			response.sendRedirect(request.getContextPath() + "/Login");

			return false;
		}
		User user = (User) session.getAttribute("user");

		String role = user.getRole();

		// Admin is allowed

		if ("ADMIN".equalsIgnoreCase(role)) {
			return true;

		}

		// Employee is not allowed to access admin URLs

		response.sendRedirect(request.getContextPath() + "/Home");

		return false;
	}

}
