package games.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import games.model.GameShopCart;

@WebServlet("/remove.action")
public class RemoveItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int itemIndex = Integer.parseInt(request.getParameter("removeItem"));
		
		GameShopCart item = new GameShopCart();
		
		System.out.println(item.cartItemName.get(itemIndex) + " game has been DELETED");
		item.remove(itemIndex);
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

}
