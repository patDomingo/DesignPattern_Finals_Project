package games.model;

public class CrashTeamRacing  implements VideoGames {
	private String gameName;
	private String gameCode;
	private double gamePrice;
	
	public CrashTeamRacing() {
		this.gameName = "Crash Team Racing";
		this.gameCode = "crashteamracing";
		this.gamePrice = 1500.00;
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