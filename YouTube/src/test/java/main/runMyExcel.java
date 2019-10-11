package main;

import utility.MyExcelExample;


public class runMyExcel {

    public static void main(String[] args) {
        MyExcelExample myexcel = new MyExcelExample();
        String print = myexcel.readMyExcel("C:\\WebSelenium2019\\group6WebAutomation\\YouTube\\src\\test\\resources\\test.xlsx");
        System.out.println(print);

    }
}
