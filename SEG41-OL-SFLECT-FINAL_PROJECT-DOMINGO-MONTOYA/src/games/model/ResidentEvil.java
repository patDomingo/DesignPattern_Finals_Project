package games.model;

public class ResidentEvil implements VideoGames {
	private String gameName;
	private String gameCode;
	private double gamePrice;

	public ResidentEvil() {
		this.gameName = "Resident Evil";
		this.gameCode = "residentevil";
		this.gamePrice = 1200.00;
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
