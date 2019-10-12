package homepage;

import utility.DataReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static DataReader dataReader = new DataReader();

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Grocery");
        itemsList.add("Phone");
        itemsList.add("Electronics");
        itemsList.add("Bodywash");
        itemsList.add("lotion");
        itemsList.add("stationary");
        itemsList.add("tablelamp");

        return itemsList;
    }
    //Excel file
//list.add("0 to n-1) <-- myStringArray[0 to n-1] <-- (iphone, iphoneXR, samsungGalaxy,. ... etc)
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../Costco/data/CostcoSearchItem.xls";
        String[] myStringArray = dataReader.fileReader2(path, 0);
        ArrayList<String> list1 = new ArrayList<String>();

// Using add() method to add elements in array_list..and adding from excel sheet
        for (int i = 0; i < myStringArray.length; i++) {
            list1.add(myStringArray[i]);
        }
        return list1;
    }
//    //Database
//// to be completed
//    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
//        List<String> list = new ArrayList<String>();
////list = connectToSqlDB.readDataBase("ItemList", "items");
//        return list;
//    }
}
