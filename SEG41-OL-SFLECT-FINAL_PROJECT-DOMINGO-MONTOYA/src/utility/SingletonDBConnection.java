package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDBConnection {
	
	//The Connection object is the targeted instance to act as Singleton.
	private static Connection connection;
	
	//with the constructor declared as private, the use of the new keyword outside this class when
	//creating instance of this class is not applicable.
	
	private SingletonDBConnection() {
	}
	
	private static Connection getConnectionInstance() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/select4db","root", "");
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			} catch  (ClassNotFoundException cfne) {
				System.err.println(cfne.getMessage());
			}
		}
		return connection;
	}
	
	//provide a global access point to get the privately declared instance value for retrieval
	public static Connection getConnection() {
		/*if(connection ==null) {
			return getConnectionInstance();
		}else {
			return connection;
		}*/
		
		return (connection == null)
			? getConnectionInstance()
			: connection;
	}
}