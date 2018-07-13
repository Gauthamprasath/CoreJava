
package corejava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StoredProcedureDemo {
    
    public static void main(String[] str) {
        
        try {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Roll No : ");
            
            String rno = sc.nextLine();
            
            System.out.println("Enter Name : ");
            
            String name = sc.nextLine();
            
            System.out.println("Enter Mobile : ");
            
            String mob = sc.nextLine();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college", "root","");
            
            CallableStatement cs = con.prepareCall("{call sp_ins('"+rno+"','"+name+"','"+mob+"')}");
            
            cs.executeUpdate();
            
            
        }catch(Exception e) {
            
            e.printStackTrace();
        }
    }
        
    
}

// u have to create prepared statement in sql command line before itself.

