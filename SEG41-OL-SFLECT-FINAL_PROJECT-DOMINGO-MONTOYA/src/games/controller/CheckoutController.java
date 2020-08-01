package games.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import games.model.GameShopCart;
import utility.SingletonDBConnection;
import java.sql.*;

@WebServlet("/checkoutCart.action")
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int cartAmountIndex = Integer.parseInt(request.getParameter("cartAmount"));
			for(int i=0; i < GameShopCart.cartItemCtr; i++) {
				Connection connection = SingletonDBConnection.getConnection();
				GameShopCart item = new GameShopCart();
				item.setGameName(GameShopCart.cartItemName.get(i));
				item.setGamePrice(GameShopCart.cartItemPrice.get(i));
				
				//Call insert to db fucntion
				if(item.insertRecord(connection)) {
					System.out.println("\nGAME WAS ADDED TO DATABASE AND UPDATED");
				}else {
					System.out.println("\nSOMETHING WENT WRONG!!!");
				}
			}
		//Boolean value will enable the arraylist.clear()
		GameShopCart.clearCart = true;
		GameShopCart.cartItemCtr = 0;
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

}
