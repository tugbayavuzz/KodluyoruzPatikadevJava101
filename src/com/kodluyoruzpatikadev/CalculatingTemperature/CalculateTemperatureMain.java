package com.kodluyoruzpatikadev.CalculatingTemperature;

import java.util.Scanner;

public class CalculateTemperatureMain {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the heat");
        heat = input.nextInt();
        String query = (heat < 5) ? "Kayak" : "";
        System.out.println(query);

        String query2 = (heat <=5 || heat <15) ? "Sinema" : "";
        System.out.println(query2);

        String query3 = (heat <=15 || heat <25) ? "Piknik" : "";
        System.out.println(query3);

        String query4 = (heat >= 25) ? "Yüzme" : "";
        System.out.println(query4);

    }
}
