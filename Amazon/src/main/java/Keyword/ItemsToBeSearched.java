package Keyword;

import common.CommonAPI;
import utillty.DataReader;

import java.io.IOException;

//import utility.DataReader;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"OutSourceData/Data Driven .xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"Amazon/OutSourceData/Data Driven .xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}

