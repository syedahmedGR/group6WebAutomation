package utility;

//import databases.ConnectToSqlDB;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataSource {

    public static ExcelReader dataReader = new ExcelReader();
    public static String [] randomSearch = {
            "how deep is your love",
            "injustice 2",
            "diablo",
            "postman",
            "halting machine",
            "supernatural",
            "vehicle comparison",
            "alltimes10",
            "magnetic stuff",
            "tron legacy",
            "xssfworkbook",
            "kmp algorithm",
            "american gods",
            "brooklyn 99 funny moments",
            "ben phillips",
            "anthony bourdain parts unknown",
    };

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("subways");
        itemsList.add("kento bento");
        itemsList.add("cat vines");
        itemsList.add("dijkstra");
        itemsList.add("hello");
        itemsList.add("alltime10s");
        itemsList.add("sam Smith");
        itemsList.add("smosh");
        itemsList.add("college humor");
        itemsList.add("vehicle comparison");
        itemsList.add("kmp algorithm");
        itemsList.add("american gods");
        itemsList.add("halting problem");
        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<String>();
//        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "C:\\WebSelenium2019\\group6WebAutomation\\YouTube\\src\\test\\java\\utility\\Search Channel.xlsx";
        String[] myStringArray = dataReader.fileReader_1D(path, 0);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < myStringArray.length; i++) list.add(myStringArray[i]);
        return list;
    }

    public static String [] getFeaturesListFromExcel() throws IOException{
        XSSFWorkbook workbook_in;
        XSSFSheet sheet_in;
        FileInputStream in;
        String fileName = "C:\\WebSelenium2019\\group6WebAutomation\\YouTube\\src\\test\\java\\utility\\Features.xlsx";
        String [] data;
        Row row;
        int i=0;
        Cell cell;
        Iterator<Row> rowIterator;
        Iterator<Cell> cellIterator;

        in = new FileInputStream(new File(fileName));
        workbook_in = new XSSFWorkbook(in);
        sheet_in = workbook_in.getSheetAt(0);
        data = new String[sheet_in.getLastRowNum()+1];
        rowIterator = sheet_in.iterator();

        while(rowIterator.hasNext()){
            row = rowIterator.next();
            cellIterator = row.cellIterator();

            while(cellIterator.hasNext()){
                cell = cellIterator.next();

                switch(cell.getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        data[i] = ""+cell.getNumericCellValue();
                        break;
                    case Cell.CELL_TYPE_STRING:
                        data[i] = ""+cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        data[i] = ""+cell.getBooleanCellValue();
                        break;
                    default:
                        System.out.println("Error at index "+i);
                }
            } i++;
        }
        in.close();

        return data;
    }

}