package games.model;

public class RingFitAdveture implements VideoGames {
	private String gameName;
	private String gameCode;
	private double gamePrice;
	
	public RingFitAdveture() {
		this.gameName = "Ring Fit Adventure";
		this.gameCode = "ringfitadventure";
		this.gamePrice = 3500.00;
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