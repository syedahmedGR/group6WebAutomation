package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class MyExcelExample {

    private XSSFWorkbook workbook_in, workbook_out;
    private XSSFSheet sheet_in, sheet_out;
    private FileOutputStream out;
    private FileInputStream in;

    public MyExcelExample(){
        workbook_out = new XSSFWorkbook();
    }

    public void writeMyExcel(String fileName, String sheetName, Map<String, Object[]> data){
        Set<String> keySet;
        int row_Count = 0, cell_Count;
        Row row;
        Cell cell;
        Object [] value;
        sheet_out = workbook_out.createSheet(sheetName);

        keySet = data.keySet(); //get the value from the key

        for(String key: keySet){
            row = sheet_out.createRow(row_Count);
            row_Count++;
            value = data.get(key);
            cell_Count = 0;

            for(Object object: value){
                cell = row.createCell(cell_Count);
                cell_Count++;

                if(object instanceof String)       cell.setCellValue( (String) object  );
                else if(object instanceof Integer) cell.setCellValue( (Integer) object );
                else if(object instanceof Double)  cell.setCellValue( (Double) object  );
                else if(object instanceof Date)    cell.setCellValue( (Date) object    );
                else if(object instanceof Boolean) cell.setCellValue( (Boolean) object );
            }
        }

        try {
            out = new FileOutputStream(new File(fileName));
            workbook_out.write(out);
            out.close();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("\nLocation: "+System.getProperty("user.home")+"/"+fileName);
        }
    }

    public String readMyExcel(String fileName){
        String data = "";
        Row row;
        Cell cell;
        Iterator<Row> rowIterator;
        Iterator<Cell> cellIterator;

        try {
            in = new FileInputStream(new File(fileName));
            workbook_in = new XSSFWorkbook(in);
            sheet_in = workbook_in.getSheetAt(0);
            rowIterator = sheet_in.iterator();

            while(rowIterator.hasNext()){
                row = rowIterator.next();
                cellIterator = row.cellIterator();

                while(cellIterator.hasNext()){
                    cell = cellIterator.next();

                    switch(cell.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            data += cell.getNumericCellValue() + "\t";
                            break;
                        case Cell.CELL_TYPE_STRING:
                            data += cell.getStringCellValue() + "\t";
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            data += cell.getStringCellValue() + "\t";
                            break;
                        default:
                            data += " \t";
                    }
                } data += "\n";
            } in.close();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("\nData is Retrieved");
        }

        return data;
    }
}
