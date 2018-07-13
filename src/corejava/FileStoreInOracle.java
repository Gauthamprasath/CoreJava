
package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class FileStoreInOracle {
    
    public static void main(String[] str) {
        
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","college","college");
            
            PreparedStatement ps = con.prepareStatement("insert into filestore values(?,?)");
            
            File f = new File("G:\\HTML\\new.html");
            
            FileInputStream fin = new FileInputStream(f);
            
            ps.setString(1, "4");
            
            ps.setBinaryStream(2, fin, fin.available());
            
            ps.executeUpdate();
            
            PreparedStatement ps1 = con.prepareStatement("insert into filestore values(?,?)");
            
            File f1 = new File("G:\\HTML\\new.html");
            
            FileInputStream fin1 = new FileInputStream(f1);
            
            ps1.setString(1, "5");
            
            ps1.setBinaryStream(2, fin1, fin1.available());
            
            ps1.executeUpdate();
            
            
        }catch(Exception e) {
            
            e.printStackTrace();
        }
    }
    
}

    