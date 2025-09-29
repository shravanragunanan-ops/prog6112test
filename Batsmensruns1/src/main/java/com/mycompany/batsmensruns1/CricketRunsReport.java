package com.mycompany.batsmensruns1;


public class CricketRunsReport {

    public static void main(String[] args) {
       
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        
        int[][] runs = {
            {5000, 3800, 4200},   
            {3500, 3700, 3900},   
            {6200, 5000, 5200}    
        };

       
        System.out.println("CRICKET RUNS REPORT");
        System.out.println("---");

      
        System.out.printf("%-15s %-20s %-20s %-20s%n", "", batsmen[0], batsmen[1], batsmen[2]);

       
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-15s %-20d %-20d %-20d%n", 
                stadiums[i], runs[i][0], runs[i][1], runs[i][2]);
        }

        
        System.out.println("\nBATSMAN TOTALS");
        System.out.println("---");

        
        for (int i = 0; i < batsmen.length; i++) {
            int total = 0;
            for (int j = 0; j < stadiums.length; j++) {
                total += runs[j][i];
            }
            System.out.printf("%-20s %-15d%n", batsmen[i], total);
        }

        
        System.out.println("\nSTADIUM TOTALS");
        System.out.println("---");

        
        for (int i = 0; i < stadiums.length; i++) {
            int total = runs[i][0] + runs[i][1] + runs[i][2];
            System.out.printf("%-15s %-15d%n", stadiums[i], total);
        }

        
        System.out.println("\nHIGHEST RUNS PER STADIUM");
        System.out.println("---");

        
        for (int i = 0; i < stadiums.length; i++) {
            int highest = runs[i][0];
            String topBatsman = batsmen[0];
            
            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > highest) {
                    highest = runs[i][j];
                    topBatsman = batsmen[j];
                }
            }
            System.out.printf("%-15s %-20s %-10d%n", stadiums[i], topBatsman, highest);
        }
    }
}