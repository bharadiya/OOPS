import java.util.*;
import java.sql.*;

public class SQLTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql:///\"w3schools\",\"root\",\"shashank\"");
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("Select * From orders");
	}
}
