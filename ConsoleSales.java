/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {

    // Constructor passing parameters to superclass
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Method to print the formatted report
    public void printReport() {
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("--------------------------------------------------");
    }
}