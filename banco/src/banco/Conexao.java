package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
	
    public static Connection getConexao() throws ClassNotFoundException, SQLException{

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabalho", "postgres", "senha");

       return con;
 
    }
}