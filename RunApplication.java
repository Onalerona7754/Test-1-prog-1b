/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input details
        System.out.print("Enter console device type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter store name: ");
        String store = scanner.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Instantiate ConsoleSales object
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);

        // Display the report
        System.out.println();
        salesReport.printReport();

        scanner.close();
    }
}