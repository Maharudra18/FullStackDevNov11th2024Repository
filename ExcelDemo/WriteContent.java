package gentech.com.ExcelDemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class WriteContent {
    public static void main(String[] args) {
        write();

    }
     private static void  write()
     {
         FileOutputStream fout=null;
         Workbook wb=null;
         Sheet sh=null;
         Row row=null;
         Cell cell=null;
         try{
             wb=new XSSFWorkbook();
             sh=wb.createSheet("Credentails");
             row=sh.createRow(0);
             cell= row.createCell(0);
             cell.setCellValue("Username");
             cell=row.createCell(1);
             cell.setCellValue("Password");

             row=sh.createRow(1);
             cell=row.createCell(0);
             cell.setCellValue("Admin");
             cell=row.createCell(1);
             cell.setCellValue("Manager");

             fout=new FileOutputStream("E:\\ExcelDemo\\Nandu.xlsx");
             wb.write(fout);

         }catch (Exception e){
             e.printStackTrace();
         }
          finally {
             try{
                 fout.close();
                 wb.close();

             }catch (Exception e){
                 e.printStackTrace();
             }
             }
         }
     }



