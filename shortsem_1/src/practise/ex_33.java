package practise;

public class ex_33 {
	public static void main(String[] args) {
		MySQLConnector sql=new MySQLConnector();
		MongoDBConnector mongo=new MongoDBConnector();
		OracleConnector oracle=new OracleConnector();
		
		sql.connect();
		mongo.disconnect();
		oracle.executeQuery("Select * from Table_name");
	}
}
interface DatabaseConnector{
	void connect();
	void disconnect();
	void executeQuery(String query);
}
class MySQLConnector implements DatabaseConnector{

	@Override
	public void connect() {
		System.out.println("Mysql DB connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Mysql DB Disconnected");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Query executed");
	}
	
}class OracleConnector implements DatabaseConnector{
	@Override
	public void connect() {
		System.out.println("Oracle DB connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Oracle DB Disconnected");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Query executed");
	}
}
class MongoDBConnector implements DatabaseConnector{
	@Override
	public void connect() {
		System.out.println("Mongo DB connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Mongo DB Disconnected");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Query executed");
	}
}
