package factoryPattern;

public class MainApp {

	public static void main(String[] args) {
		  FactoryConnect connectionFactory = new FactoryConnect();

	        // Get an object of DatabaseConnection and call its connect method.
	        Connectivity dbConnection = connectionFactory.getConnection("DATABASE");
	        dbConnection.connect();

	        // Get an object of FileConnection and call its connect method.
	        Connectivity fileConnection = connectionFactory.getConnection("FILE");
	        fileConnection.connect();

	}

}
