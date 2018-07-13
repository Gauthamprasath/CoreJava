
package corejava;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {
    
    public static void main(String args[]){
        
        try{
            
            File f = new File("C:\\Users\\Lenovo\\Documents\\JavaPracFiles\\student.xlsx");
            
            FileOutputStream fout = new FileOutputStream(f);
            
            XSSFWorkbook xb = new XSSFWorkbook();
            
            XSSFSheet xs = xb.createSheet("student");
            
            XSSFRow xr = xs.createRow(0);
            
            XSSFCell xc = xr.createCell(0);
            
            xc.setCellValue("GAUTHAM");
            
            xb.write(fout);
            
            fout.close();
            
             
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
    }
    
}
