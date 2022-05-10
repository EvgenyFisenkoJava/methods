package ru.skypro.methods;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {

    //метод к заданию 1

    public static boolean isLeapYear(int year) {


        boolean leap = year % 4 == 0;
        boolean notLeap = year % 100 != 0;
        boolean alsoNotLeap = year % 100 == 0 && year % 400 ==0;
        if (leap && notLeap || alsoNotLeap)  {
            System.out.println(year + " " + "високосный год");
        }
        else {
            System.out.println(year + " " + "не високосный год");
        }
        return leap;
    }

    // метод к заданию 2

    public static int clientOperationSystem (int clientDeviceYear, int clientsOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientsOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите IOS приложение по ссылке");
        }
        else if (clientsOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite версию IOS приложения по ссылке");
        }
        else if (clientsOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите Android приложение по ссылке");
        }
        else {
            System.out.println("Установите lite версию Android приложения по ссылке");
        }

        return clientDeviceYear;
    }

    //метод к заданию 3

    public static int deliveryDays (int deliveryDistance, int oneDayDelivery, int intervalKm, int range, int deliveryTime) {
        if (deliveryDistance < oneDayDelivery) {
            System.out.println("Delivery time is " + deliveryTime + " days");
        }
        if (deliveryDistance >= oneDayDelivery && deliveryDistance < range ) {
            deliveryTime = deliveryTime+1;
            System.out.println("Delivery time is " + deliveryTime + " days");
        }
        else if (deliveryDistance >= range && deliveryDistance < range + intervalKm) {
            deliveryTime = deliveryTime + 2;

            System.out.println("Delivery time is " + deliveryTime + " days");
        }
        else {
            deliveryTime = deliveryTime + 2;
            System.out.println("Delivery time is more than " + deliveryTime + " days");
        }


        return deliveryDistance;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println("задание 1");

        int year = 2004;
        isLeapYear(year);


        System.out.println("задание 2");

        int clientsOS = 1;
        int clientDeviceYear = 2015;

        clientOperationSystem(clientDeviceYear, clientsOS);

        System.out.println("задание 3");

        int deliveryDistance = 95;
        int oneDayDelivery = 20;
        int intervalKm = 40;
        int range = oneDayDelivery + intervalKm;
        int deliveryTime = 1;
        deliveryDays(deliveryDistance, oneDayDelivery, intervalKm, range, deliveryTime);






    }
}
