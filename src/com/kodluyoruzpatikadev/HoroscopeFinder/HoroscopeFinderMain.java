package com.kodluyoruzpatikadev.HoroscopeFinder;

import java.util.Scanner;

public class HoroscopeFinderMain {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your birth month");
        String month=input.next();

        System.out.println("Enter your birth day");
        int day=input.nextInt();

        String horoscope="";

        if (month.equalsIgnoreCase("January"))
        {
            if (day>22)
                horoscope="Aquarius";
            else
                horoscope="Capricorn";
        }

        if (month.equalsIgnoreCase("February"))
        {
            if (day>20)
                horoscope="Pisces";
            else
                horoscope="Aquarius";
        }

        if (month.equalsIgnoreCase("March"))
        {
            if (day>21)
                horoscope="Aries";
            else
                horoscope="Pisces";
        }

        if (month.equalsIgnoreCase("April"))
        {
            if (day>21)
                horoscope="Taurus";
            else
                horoscope="Aries";
        }

        if (month.equalsIgnoreCase("May"))
        {
            if (day>22)
                horoscope="Gemini";
            else
                horoscope="Taurus";
        }

        if (month.equalsIgnoreCase("June"))
        {
            if (day>23)
                horoscope="Cancer";
            else
                horoscope="Gemini";
        }

        if (month.equalsIgnoreCase("July"))
        {
            if (day>23)
                horoscope="Leo";
            else
                horoscope="Cancer";
        }

        if (month.equalsIgnoreCase("August"))
        {
            if (day>23)
                horoscope="Virgo";
            else
                horoscope="Leo";
        }

        if (month.equalsIgnoreCase("September"))
        {
            if (day>23)
                horoscope="Libra";
            else
                horoscope="Virgo";
        }

        if (month.equalsIgnoreCase("October"))
        {
            if (day>23)
                horoscope="Akrep";
            else
                horoscope="Libra";
        }

        if (month.equalsIgnoreCase("November"))
        {
            if (day>22)
                horoscope="Sagittarius";
            else
                horoscope="Akrep";
        }

        if (month.equalsIgnoreCase("December"))
        {
            if (day>22)
                horoscope="Capricorn";
            else
                horoscope="Sagittarius";
        }

        System.out.println(day+ " " +month+ " ---->" +horoscope+ " ");

    }
}
    

