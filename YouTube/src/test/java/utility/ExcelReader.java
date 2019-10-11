package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader  {

    XSSFWorkbook wb = null;
    XSSFSheet sheet = null;
    Cell cell = null;
    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;

    public String[][] fileReader_2D(String path,int sheetIndex) throws IOException {
        String[][] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCol + 1];

        for (int i = 1; i < data.length; i++) {
            XSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                XSSFCell cell = rows.getCell(j);
                String cellData = cell.getStringCellValue();
                data[i][j] = cellData;
            }
        }
        return data;
    }

    public String[] fileReader_1D(String path, int sheetIndex) throws IOException {
        String[] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for (int i = 1; i < data.length; i++) {
            XSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                XSSFCell cell = rows.getCell(j);
                String cellData = cell.getStringCellValue();
                data[i] = cellData;
            }
        }
        return data;
    }

    public void writeBack(String value) throws IOException {
        wb = new XSSFWorkbook();
        sheet = wb.createSheet();
        Row row = sheet.createRow(rowNum);
        row.setHeightInPoints(10);

        fio = new FileOutputStream(new File("ExcelFile.xls"));
        wb.write(fio);
        for (int i = 0; i < row.getLastCellNum(); i++) {
            row.createCell(i);
            cell.setCellValue(value);
        }
        fio.close();
    }
}