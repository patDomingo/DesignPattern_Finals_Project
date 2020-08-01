package games.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import games.model.VideoGames;
import games.model.VideoGamesFactory;


@WebServlet("/game.action")
public class GamesControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gameCode = request.getParameter("gameCode");
		
		VideoGames game = new VideoGamesFactory().getVideoGames(gameCode);
		
		request.setAttribute("game", game);

		request.getRequestDispatcher("viewProducts.jsp").forward(request, response);
		
		
	}

}
