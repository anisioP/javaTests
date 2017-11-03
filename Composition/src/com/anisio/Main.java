package com.anisio;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20, 5);

        Case theCAse = new Case ("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("AOL", "Asus", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("A200", "Asus", 4, 6, "v2.5");

        PC thePc = new PC (theCAse, monitor, motherboard);

        thePc.powerUp();
        // write your code here
    }
}
