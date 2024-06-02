import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCConInsert
{
  public static void main(String[] args)
{
    Connection cn = null;
    try
	{
      // Loading driver
      Class.forName("com.mysql.jdbc.Driver");
      // Another way
      //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      // Creating connection
      cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
      // creating Statement
      Statement stmt = cn.createStatement();
      // Executing Query
        stmt.executeUpdate("INSERT INTO Emp(id, name,age) VALUES ('104','ABAC','32')");
       }
	catch (ClassNotFoundException e)
	{
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
	catch (SQLException e)
	{
       // TODO Auto-generated catch block
       e.printStackTrace();
    }
	finally
	{
      if(cn != null)
	{
         //closing connection
         try {
           cn.close();
         }
	catch (SQLException e)
	{
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
    }
}
}
