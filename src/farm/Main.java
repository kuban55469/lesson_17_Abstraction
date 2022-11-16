package farm;

import farm.*;

public class Main {
    public static void main(String[] args) {
        Sheep[] sheep = {
                new Sheep(20, 4, 'M', "Shon"),
                new Sheep(17, 5, 'W', "Thor"),
                new Sheep(25, 7, 'M', "Koros"),
        };
        Hors[] hors = {
                new Hors(120, 12, 'M', "Axiles"),
                new Hors(110, 10, 'M', "Kit")
        };
        Cow[] cows = {
                new Cow(78, 7, 'W', "Kip"),
                new Cow(66, 9, 'M', "Pit"),
                new Cow(90, 12, 'M', "Buk"),
                new Cow(55, 3, 'W', "Los"),
                new Cow(45, 4, 'M', "Pol"),
        };
        Cow cow = new Cow(90, 4, 'W', "Milas");
        Hors hors1 = new Hors(178, 17, 'M', "Tas");
        Sheep sheep1 = new Sheep(30, 3, 'W', "Pil");

        Farm farm1 = new Farm("Sokuluk", cows, hors, sheep, "Aidarbek");
        System.out.println(farm1);
        Farm farm2 = new Farm("Talas",new Cow[]{cow},new Hors[]{ hors1}, new Sheep[]{sheep1}, "Kanibek");
        System.out.println(farm2);
    }
}