
package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BulkDataRetrievel {
    
    public static void main(String[] str) {
        
        try {
            
            File f = new File("C:\\Users\\Lenovo\\Documents\\JavaPracFiles\\student.xlsx");
            
            FileInputStream fin = new FileInputStream(f);
            
            XSSFWorkbook xb = new XSSFWorkbook(fin);
            
            XSSFSheet xs = xb.getSheet("student");
            
            Iterator ite1 = xs.iterator();
            
            while(ite1.hasNext()) {
                
                Row r = (Row)ite1.next();
                
                Iterator ite2 = r.iterator();
                
                while(ite2.hasNext()) {
                    
                    Cell c = (Cell)ite2.next();
                    
                    switch(c.getCellType()) {
                        
                        case Cell.CELL_TYPE_STRING:
                            
                            System.out.println(c.getStringCellValue());
                            
                            break;
                            
                        case Cell.CELL_TYPE_NUMERIC:
                            
                            System.out.println(c.getNumericCellValue());
                            
                            break;
                    }
                }
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
