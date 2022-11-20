package java8;

import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Announcement phone1 = new Phone("Iphone", "📱", 147000, "Amazing phone", "14 PRO Max", 256);
        Announcement phone2 = new Phone("Samsung", "📱", 58000, "Great phone", "S21", 128);
        Announcement[] phones = {phone1, phone2};

        Announcement laptop1 = new Laptop("MacBook", "\uD83D\uDE0D", 129000, "Wonderful laptop", "Mac OS");
        Announcement laptop2 = new Laptop("Acer", "\uD83E\uDD16", 176000, "Productive laptop", "Windows");
        Announcement[] laptops = {laptop1, laptop2};

        Announcement home1 = new Home("Ihlas", "\uD83C\uDFE2", 3500000, "Great Home", "Multi-storey", 10);
        Announcement home2 = new Home("Chaos", "\uD83C\uDFE0", 15000000, "Amazing Home", "House", 25);
        Announcement[] homes = {home1, home2};

        Announcement car1 = new Car("Mercedes-Benz", "\uD83D\uDE98", 15000000, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Announcement car2 = new Car("BMW", "\uD83D\uDE99", 12000000, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Announcement[] cars = {car1, car2};

        Announcement airplane1 = new Airplane("Supermarine Spitfire", "\uD83D\uDEE9", 125000000, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Announcement airplane2 = new Airplane("Airbus A320", "✈️", 23000000, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Announcement[] airplanes = {airplane1, airplane2};

        Announcement helicopter1 = new Helicopter("MD 500 Defender", "\uD83D\uDE81", 13500000, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Announcement helicopter2 = new Helicopter("Boeing AH-64 Apache", "\uD83D\uDE81", 115000000, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Announcement[] helicopters = {helicopter1, helicopter2};

        Announcement[] announcements1 = {};

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Announcement[] announcements = {phone1, phone2, laptop1, laptop2, home1, home2,
                car1, car2, helicopter1, helicopter2, airplane1, airplane2};

//        System.out.print("Enter price: ");
//        findByPrice(scanner1.nextDouble(), announcements);

//
//        System.out.print("Enter name: ");
//        findByName(scanner2.nextLine(),announcements);

//        findByAllPrice(announcements);

//        findBySortPrice(announcements);

//        System.out.println("Max prise: " + findByMaxPrice(announcements));


    }
    public static void findBySortPrice(Announcement[] announcements){
        long counter1 = 0;
        for (Announcement announcement : announcements) {
            if (announcement.getPrice() > counter1) {
                counter1 = (long) announcement.getPrice();
            }
            System.out.println(announcement.getName() + " " + counter1 + " --> " + announcement.toString() + "\n");
        }

    }
    public static long findByMaxPrice(Announcement[] announcements){
        long max = 0;
        for (Announcement announcement : announcements) {
            if (announcement.getPrice() > max) {
                max = (long) announcement.getPrice();
            }
        }
        return max ;
    }

    public static void findByPrice(double price, Announcement[] announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.getPrice() == price) {
                System.out.println(announcement);
            }
        }
    }

    public static void findByName(String name, Announcement[] announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.getName().equals(name)) {
                System.out.println(announcement);
            }
        }
    }

    public static void findByAllPrice(Announcement[] announcements){
        long counter = 0;
        for (Announcement announcement : announcements) {
            counter += announcement.getPrice();
        }
        System.out.println("All prises is: " + counter + " $");
    }

}

