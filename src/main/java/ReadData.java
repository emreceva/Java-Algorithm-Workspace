
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadData {

    public void readExcel(File src) throws IOException {

        FileInputStream input = new FileInputStream(src);
        Workbook workbook = new XSSFWorkbook(input);

        Sheet sheet = workbook.getSheetAt(0);

        for(int i = 1 ; i<sheet.getLastRowNum(); i++){
            Cell cell = sheet.getRow(i).getCell(1);
            cell.setCellType(CellType.STRING);
            //driver.findElemtent(By.id("email")).sendKeys(cell.getStringCellValue());

            cell = sheet.getRow(i).getCell(2);
            cell.setCellType(CellType.STRING);
            //driver.findElement(By.id("password")).sendKeys(cell.getStringCellValue());

        }



    }
}
