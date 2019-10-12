package menu;

import databases.ConnectToSqlDB;
import utillty.DataReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static  DataReader dataReader = new DataReader();
    //public static ExcelReader excelReader = new ExcelReader();
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Iphone");
        itemsList.add("Book");
        itemsList.add("Laptop");
        itemsList.add("Stroller");
        itemsList.add("Pen");
        itemsList.add("Air Condition");
        itemsList.add("Kindle");
        itemsList.add("MacBook Air");

        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }


    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException {
        //List<String> list = new ArrayList<String>(); ../Generic/browser-driver/chromedriver
        String path = "../Amazon/data/AmazonSearchItems.xls";
        String[] myStringArray = dataReader.fileReader2(path, 1);
        for (int i = 0; i < myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();
        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;

    }
}
