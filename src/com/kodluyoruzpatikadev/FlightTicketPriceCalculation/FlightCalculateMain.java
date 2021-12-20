package com.kodluyoruzpatikadev.FlightTicketPriceCalculation;

import java.util.Scanner;

public class FlightCalculateMain {
    public static void main(String[] args) {
        int distance, age;
        double normalPrice,
                yasIndirimTutari, yasIndirimTutari2, yasIndirimTutari3,
                yasIndirimiOrani = 0.5, yasIndirimiOrani2 = 0.10, yasIndirimiOrani3 = 0.30,
                indirimliTutar, indirimliTutar2, indirimliTutar3,
                gidiSDonusBiletIndirimi,
                toplamTutar, toplamTutar2, toplamTutar3;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz: ");
        distance = input.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        age = input.nextInt();

        normalPrice = distance * 0.10;

        yasIndirimTutari = normalPrice * yasIndirimiOrani;
        indirimliTutar = normalPrice - yasIndirimTutari;
        gidiSDonusBiletIndirimi = indirimliTutar * 0.20;
        toplamTutar = (indirimliTutar - gidiSDonusBiletIndirimi) * 2;

        yasIndirimTutari2 = normalPrice * yasIndirimiOrani2;
        indirimliTutar2 = normalPrice - yasIndirimTutari2;
        gidiSDonusBiletIndirimi = indirimliTutar2 * 0.20;
        toplamTutar2 = (indirimliTutar2 - gidiSDonusBiletIndirimi) * 2;

        yasIndirimTutari3 = normalPrice * yasIndirimiOrani3;
        indirimliTutar3 = normalPrice - yasIndirimTutari3;
        gidiSDonusBiletIndirimi = indirimliTutar3 * 0.20;
        toplamTutar3 = (indirimliTutar3 - gidiSDonusBiletIndirimi) * 2;


        if (age < 12) { // <12 --> 50%
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön\n2 => Gidiş Dönüş");
            int value = input.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Tek Yön : " + normalPrice);
                    break;
                case 2:
                    System.out.println("Gidiş Dönüş : " + toplamTutar);
                    break;
                default:
                    System.out.println(" Hatalı Veri Girdiniz !");
            }

        } else if (age >= 12 && age <= 24) {
            System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
            int value = input.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Tek Yön : " + normalPrice);
                    break;
                case 2:
                    System.out.println("Gidiş Dönüş : " + toplamTutar2);
                    break;
                default:
                    System.out.println(" The value you entered is the wrong data type for this field");
            }
        } else if (age > 65) {
            System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
            int value = input.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Tek Yön : " + normalPrice);
                    break;
                case 2:
                    System.out.println("Gidiş Dönüş : " + toplamTutar3);
                    break;
                default:
                    System.out.println(" The value you entered is the wrong data type for this field");
            }
        } else
            System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
        int value = input.nextInt();

        switch (value) {
            case 1:
                System.out.println("Tek Yön : " + normalPrice);
                break;
            case 2:
                System.out.println("Gidiş Dönüş : " + toplamTutar3);
                break;
            default:
                System.out.println(" The value you entered is the wrong data type for this field");
        }

    }
}
