
package corejava;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
    
    public static void main(String[] str) {
        
        try {
            File f = new File("C:\\Users\\Lenovo\\Documents\\JavaPracFiles\\student.xlsx");
            FileInputStream fin = new FileInputStream(f);
            XSSFWorkbook xb = new XSSFWorkbook(fin);
            XSSFSheet xs = xb.getSheet("student");
            XSSFRow r = xs.getRow(0);
            XSSFCell c = r.getCell(0);
            String name = c.getStringCellValue();
            System.out.println(name);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
