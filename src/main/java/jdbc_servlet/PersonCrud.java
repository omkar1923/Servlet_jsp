package jdbc_servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class PersonCrud {
	public Connection loadDriver() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "root");
		return connection;
	}

	public int signUp(Person person) throws Exception {
		Connection connection = loadDriver();
		String querry = "insert into person(id,name,phone,address,email,password) values (?,?,?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(querry);
		preparedStatement.setInt(1, person.getId());
		preparedStatement.setString(2, person.getName());
		preparedStatement.setLong(3, person.getPhone());
		preparedStatement.setString(4, person.getAddress());
		preparedStatement.setString(5, person.getEmail());
		preparedStatement.setString(6, person.getPassword());
		
		
		
		int result = preparedStatement.executeUpdate();
		connection.close();
		return result;

	}

	public String loginPerson(String email) throws Exception {
		Connection connection = loadDriver();
		String query = "Select password from person where email=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		ResultSet set = preparedStatement.executeQuery();
		String password = null;
		while (set.next()) {
			password = set.getString("password");
		}
		connection.close();
		return password;

	}


}
