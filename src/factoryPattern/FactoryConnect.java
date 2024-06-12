package factoryPattern;



public class FactoryConnect {

	 public Connectivity getConnection(String connectionType) {
	        if (connectionType == null) {
	            return null;
	        }
	        if (connectionType.equalsIgnoreCase("DATABASE")) {
	            return new DatabaseConnect();
	        } else if (connectionType.equalsIgnoreCase("FILE")) {
	            return new FileConnect();
	        }
	        return null;
	    }

}
