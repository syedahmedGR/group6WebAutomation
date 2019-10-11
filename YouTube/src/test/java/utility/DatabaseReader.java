package utility;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class DatabaseReader {

    private Scanner sc;

    private class searchItem{
        private int id;
        private String element;


    }

    public void readData(){
        try{
            sc = new Scanner(new File(""));
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
