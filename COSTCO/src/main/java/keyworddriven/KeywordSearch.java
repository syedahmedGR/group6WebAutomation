package keyworddriven;

import utility.DataReader;
import java.io.IOException;

public class KeywordSearch {
    DataReader dr = new DataReader();
//    public String[] getDataFromExcelFile() throws IOException {
//        String path = "../Costco/data/CostcoSearchItem.xls";
//        String [] data = dr.fileReader2(path,1);
//        return data;
//    }
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = "../Costco/data/CostcoSearchItem.xls"; // System.getProperty("user.dir")+"/Pnt/data/file2.xls";
        String [] data = dr.fileReader2(path,1);
        System.out.println(data);
        return data;
    }
}
