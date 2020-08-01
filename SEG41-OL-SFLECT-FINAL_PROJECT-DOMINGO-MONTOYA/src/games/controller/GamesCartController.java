package games.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import games.model.GameShopCart;
import games.model.VideoGames;
import games.model.VideoGamesFactory;

@WebServlet("/addToCart.action")
public class GamesCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gameCode = request.getParameter("gameCode");
		
		VideoGames game = new VideoGamesFactory().getVideoGames(gameCode);	
		GameShopCart gameCart = new GameShopCart();
	
		GameShopCart.cartItemName.add(game.getGameName());
		GameShopCart.cartItemPrice.add(game.getGamePrice());
		GameShopCart.cartItemCtr++;
		GameShopCart.clearCart = false;
		
		
		//To Check amount of cartItemCtr currently
		System.out.println("GameShopCart.cartItemCtr: " + GameShopCart.cartItemCtr);
		
		int i;
		double price = 0;
		for(i=0; i < GameShopCart.cartItemCtr; i++) {
			price = price + GameShopCart.cartItemPrice.get(i); 
			gameCart.setTotalAmount(price);
			System.out.println(GameShopCart.cartItemName.get(i));
		}
		
		GameShopCart.currentTotalAmount = gameCart.getTotalAmount();
		
		request.setAttribute("gameCart", gameCart);
		
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		
		
	
	}

}
