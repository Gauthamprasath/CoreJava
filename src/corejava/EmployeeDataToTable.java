
package corejava;

import java.util.*;
import java.sql.*;


public class EmployeeDataToTable {
    
    public static void main(String args[]){
        
        
        try{
            
            String id[] = new String[5];
            String name[] = new String[5];
            String cat[] = new String[5];
            Double sal[] = new Double[5];
            
            Scanner sc = new Scanner(System.in);
        
            for(int i=0;i<3;i++){
            
            System.out.println("Enter the id : ");
        
            id[i] = sc.next();
        
            System.out.println("Enter Name : ");
            
            name[i] = sc.next();
                    
            
            System.out.println("Enter Category : ");
            
            cat[i] = sc.next();
        
            System.out.println("Enter Salary : ");
        
            sal[i] = sc.nextDouble();
            
            }
        
            Class.forName("oracle.jdbc.driver.OracleDriver");
        
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","employee","employee");
            
            for(int i=0;i<3;i++){
        
                PreparedStatement ps = c.prepareStatement("insert into salary values ('"+id[i]+"','"+name[i]+"','"+cat[i]+"','"+sal[i]+"') ");
        
                ps.executeUpdate();
                
            }
                       
            }catch(Exception e){
            
                e.printStackTrace();
            }
        
    }
    
    
}
