import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LazyConnection {

    private static Connection connInstance = null;


    public static Connection getConnInstance() throws SQLException {

    if (connInstance == null){

       connInstance =  DriverManager.getConnection(
               "jdbc:mysql://127.0.0.1:3306/CS7340_test", "root", "Chas3755");

    }

    return connInstance;


    }
}
