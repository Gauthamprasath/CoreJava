package corejava;

import java.util.Scanner;
import java.sql.*;

public class StoreDataInOracle {
    
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
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            
            PreparedStatement ps = con.prepareStatement("insert into student values('"+rno+"','"+name+"','"+mob+"')");
            
            ps.executeUpdate();
            
        }catch(Exception e) {
            
            e.printStackTrace();
        }
    }
    
}
