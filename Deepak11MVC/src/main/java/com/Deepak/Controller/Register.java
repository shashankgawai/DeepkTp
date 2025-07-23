package com.Deepak.Controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Deepak.DBConnections.DBConncection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nameString = req.getParameter("name1");
		String emailString = req.getParameter("email1");
		String passString = req.getParameter("pass1");
		String cityString = req.getParameter("city1");

		try {
			Connection con = DBConncection.getcConnection();
			String sqlString = "insert into register values(?,?,?,?)";
			PreparedStatement sPreparedStatement = con.prepareStatement(sqlString);
			sPreparedStatement.setString(1, nameString);
			sPreparedStatement.setString(2, emailString);
			sPreparedStatement.setString(3, passString);
			sPreparedStatement.setString(4, cityString);

			int cout = sPreparedStatement.executeUpdate();

			if (cout > 0) {
				System.out.println("Succsefully Entry");

				RequestDispatcher rsDispatcher = req.getRequestDispatcher("/login.html");
				rsDispatcher.include(req, resp);
			} else {
				System.out.println("Error Occur");

				RequestDispatcher rsDispatcher = req.getRequestDispatcher("/register.html");
				rsDispatcher.include(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}