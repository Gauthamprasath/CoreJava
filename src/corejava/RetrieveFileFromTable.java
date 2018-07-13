
package corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveFileFromTable {
    
    public static void main(String[] str) {
        
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","college","college");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from filestore");
            int i=0;
            while(rs.next()) {
                Blob b = rs.getBlob("fname");
                byte[] by =  b.getBytes(++i, (int)b.length());
                File f = new File("G:\\hello.html");
               FileOutputStream fout = new FileOutputStream(f);
               fout.write(by);
               fout.close();
            }
        }catch(Exception e) {
            
            e.printStackTrace();
        }
    }
    
}
