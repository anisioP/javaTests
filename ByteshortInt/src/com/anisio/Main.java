package com.anisio;

public class Main {

    public static void main(String[] args) {

        //tamanho maximo de 32
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;
        System.out.println(maxValue/2);

        //tamanho maximo de 8
        byte minbytevalue = -128;
        byte myNewByteValue = (byte) (minbytevalue/2);
        System.out.println(myNewByteValue);

        //tamanho maximo de 16
        short myshort = 32767;

        //tamanho de 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;


    }
}
