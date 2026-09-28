/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingconsolereport;

public class gamingSalesReport {

    public static void main(String[] args) {
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

       
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("\t\t" + consoles[0] + "\t" + consoles[1] + "\t" + consoles[2]);

        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + sales[i][0] + "\t" + sales[i][1] + "\t" + sales[i][2]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int highestSales = 0;
        String highestCity = "";

        
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            System.out.println(cities[i] + "\t" + total);

            if (total > highestSales) {
                highestSales = total;
                highestCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + highestCity);
        System.out.println("--------------------------------------------------");
    }
}