package keywordriven;

import utility.ExcelReader;
import java.io.IOException;

public class KeywordSearch {
    ExcelReader dr = new ExcelReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("../Walmart/data/WalmartSearchItem.xls");
        String [] data = dr.fileReader2(path,1);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = "../Walmart/data/WalmartSearchItem.xls";                                       // System.getProperty("user.dir")+"/Pnt/data/file2.xls";
        String [] data = dr.fileReader2(path,1);
        return data;
    }
}
