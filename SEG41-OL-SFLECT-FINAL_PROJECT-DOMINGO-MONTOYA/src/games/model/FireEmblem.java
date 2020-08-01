package games.model;

public class FireEmblem implements VideoGames {
	private String gameName;
	private String gameCode;
	private double gamePrice;
	
	public FireEmblem() {
		this.gameName = "Fire Emblem";
		this.gameCode = "fireemblem";
		this.gamePrice = 2800.00;
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