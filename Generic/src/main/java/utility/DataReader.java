package utility;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataReader {
        HSSFWorkbook wb = null;
        HSSFSheet sheet = null;
        Cell cell = null;
        FileOutputStream fio = null;
        int numberOfRows, numberOfCol, rowNum;

        public String[][] fileReader1(String path,int sheetIndex) throws IOException {
            String[][] data = {};
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            wb = new HSSFWorkbook(fis);
            sheet = wb.getSheetAt(sheetIndex);
            numberOfRows = sheet.getLastRowNum();
            numberOfCol = sheet.getRow(0).getLastCellNum();
            data = new String[numberOfRows + 1][numberOfCol + 1];

            for (int i = 1; i < data.length; i++) {
                HSSFRow rows = sheet.getRow(i);
                for (int j = 0; j < numberOfCol; j++) {
                    HSSFCell cell = rows.getCell(j);
                    String cellData = cell.getStringCellValue(); //no need to call method getCellValue(cell);
                    data[i][j] = cellData;
                }
            }
            return data;
        }
        public String[] fileReader2(String path, int sheetIndex) throws IOException {
            String[] data = {};
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            wb = new HSSFWorkbook(fis);
            sheet = wb.getSheetAt(sheetIndex);
            numberOfRows = sheet.getLastRowNum();
            numberOfCol = sheet.getRow(0).getLastCellNum();
            data = new String[numberOfRows + 1];

            for (int i = 1; i < data.length; i++) {
                HSSFRow rows = sheet.getRow(i);
                for (int j = 0; j < numberOfCol; j++) {
                    HSSFCell cell = rows.getCell(j);
                    String cellData = cell.getStringCellValue(); // corrections no need this method getCellValue(cell);
                    data[i] = cellData;
                }
            }
            return data;
        }
/* public String getCellValue(HSSFCell cell) {
Object value = null;

int dataType = cell.getCellType();
//Integer data = Integer.parseInt(cell.getCellType());
if (dataType == HSSFCell.CELL_TYPE_NUMERIC) {
value = cell.getNumericCellValue();
} else if (dataType == HSSFCell.CELL_TYPE_STRING) {
value = cell.getStringCellValue();
} else if (dataType == HSSFCell.CELL_TYPE_BOOLEAN) {
value = cell.getBooleanCellValue();
}
return value.toString();
}*/

//        public void writeBack(String value) throws IOException {
//            wb = new HSSFWorkbook();
//            sheet = wb.createSheet();
//            Row row = sheet.createRow();
//
//        }
}
