package games.model;

public class Bayonetta implements VideoGames {
	private String gameName;
	private String gameCode;
	private double gamePrice;
	
	public Bayonetta() {
		this.gameName = "Bayonetta";
		this.gameCode = "bayonetta";
		this.gamePrice = 1400.00;
	}

	@Override
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	@Override
	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
	@Override
	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
}
