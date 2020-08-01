package games.model;

public class VideoGamesFactory extends AbstractFactory {
	@Override
	public VideoGames getVideoGames(String gameName) {
		VideoGames game = null;
		 
		switch(gameName) {
		case "minecraft":
			game = new Minecraft();
			break;
		case "crashteamracing":
			game = new CrashTeamRacing();
			break;
		case "ringfitadventure":
			game = new RingFitAdveture();
			break;
		case "fireemblem":
			game = new FireEmblem();
			break;
		case "bayonetta":
			game = new Bayonetta();
			break;
		case "residentevil":
			game = new ResidentEvil();
			break;
		}
		
		return game;
	}
}
