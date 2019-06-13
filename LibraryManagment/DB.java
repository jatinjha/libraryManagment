package LibraryManagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection(){
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","lib","lib1");
        }catch(Exception e){System.out.println(e);}
        return con;
    }
}

