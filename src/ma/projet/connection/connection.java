package ma.projet.connection;
import java.sql.*;

public class connection {
	
	private static String login = "root"; 
	private static String password = "";
	private static String url = "jdbc:mysql://localhost/demoJDBC"; 
	private static Connection cn = null; 
	static { try { 
	//?tape 1 : Charger le driver de la base de donn?es cible
	 
	// Class.forName("com.mysql.jdbc.Driver");
	Class.forName("com.mysql.jdbc.Driver"); 
	//?tape 2 : Authentification aupr?s de la base de donn?es et s?lectionner le
//	sch?ma
	cn = DriverManager.getConnection(url, login, password); 
	} 
	catch (ClassNotFoundException ex) { 
	System.out.println("Impossible de charger le driver"); ex.printStackTrace(); 
	} 
	catch (SQLException ex) { 
	 System.out.println("Erreur de connexion"); 
	 } 
	 } 

	
	public static Connection getCN() {
		return cn;
	}
	public connection() {
		// TODO Auto-generated constructor stub
	}

}
