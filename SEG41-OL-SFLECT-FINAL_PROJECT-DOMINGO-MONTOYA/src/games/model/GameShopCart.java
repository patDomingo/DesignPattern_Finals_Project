package games.model;

import java.util.ArrayList;
import java.sql.*;

public class GameShopCart implements GamesFacade {
	
		private String gameName;
		private double gamePrice;
		private double totalAmount;
		
		public static ArrayList<String> cartItemName = new ArrayList<String>();
		public static ArrayList<Double> cartItemPrice = new ArrayList<Double>();
		public static int cartItemCtr = 0;
		public static double currentTotalAmount;
		public static boolean clearCart = false;
		
		public GameShopCart() {
			
		}
		
		public GameShopCart(String gameName, double gamePrice) {
			this.gameName = gameName;
			this.gamePrice = gamePrice;
		}
		
		public GameShopCart(String gameName, double gamePrice, double totalAmount) {
			this.gameName = gameName;
			this.gamePrice = gamePrice;
			this.totalAmount = totalAmount;
		}
		

		public String getGameName() {
			return gameName;
		}


		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

		public double getGamePrice() {
			return gamePrice;
		}

		public void setGamePrice(double gamePrice) {
			this.gamePrice = gamePrice;
		}



		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		
		private void removeItem(int itemIndex) {
			GameShopCart.currentTotalAmount = GameShopCart.currentTotalAmount - GameShopCart.cartItemPrice.get(itemIndex);
			GameShopCart.cartItemName.remove(itemIndex);
			GameShopCart.cartItemPrice.remove(itemIndex); 
			GameShopCart.cartItemCtr--;
		}
		
		@Override
		public void remove(int itemIndex) {
			removeItem(itemIndex);
		}
		
		
		//DataBase Functions
		public boolean createTable(Connection connection) {
			boolean isSuccess = false;
			if(connection != null) {
				System.out.println("Connection is SUCCESSFUL");
				try {
					Statement create = connection.createStatement();
					String sql = "CREATE TABLE gameDB " +
							"(id INTEGER not NULL AUTO_INCREMENT, " +
							" gameName VARCHAR(255), " + 
							" gamePrice DOUBLE, " + 
							" PRIMARY KEY ( id ))"; 
					
					create.execute(sql);
					isSuccess = true;
				}catch (SQLException sqle) {
					System.err.println(sqle.getMessage());
				}
			}
			return isSuccess;
		}
		
		public boolean insertRecord(Connection connection) {
			boolean isSuccess = false;
			if(connection != null) {
				System.out.println("Connection is SUCCESSFUL");
				String sql = "insert into gameDB(gameName, gamePrice) values(?,?)";
				try {
					PreparedStatement prep = connection.prepareStatement(sql);
					
					prep.setString(1, this.gameName);
					prep.setDouble(2, this.gamePrice);
					prep.executeUpdate();
					
					isSuccess = true;
				}catch(SQLException sqle) {
					isSuccess = false;
				}catch(Exception e) {
					isSuccess = false;
				}
			}
			return isSuccess;
		}
		
		
		
		
		
		
}
