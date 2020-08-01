package games.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import games.model.GameShopCart;

import java.sql.*;

import utility.SingletonDBConnection;

@WebServlet("/createtables.action")
public class CreateTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Creates a table using a singleton db connection
		Connection connection = SingletonDBConnection.getConnection();
		GameShopCart item = new GameShopCart();
		
		if(item.createTable(connection)) {
			System.out.println("Successfully created table");
		}else {
			System.out.println("Table creation was not successful");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
