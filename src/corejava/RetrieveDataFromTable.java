
package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class RetrieveDataFromTable {
    
    public static void main(String[] str) {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "employee","employee");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from salary");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cat = rs.getString("cat");
                int amount = rs.getInt("amount");
                
                System.out.println(id);
                System.out.println(name);
                System.out.println(cat);
                System.out.println(amount);
                System.out.println("********************");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
