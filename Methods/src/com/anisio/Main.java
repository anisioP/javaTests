package com.anisio;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = calculateScore("Andre", 20);
        System.out.println(result);
        int result2 = calculateScore(20);
        System.out.println(result2);

    }
    //overloading methods
    public static int calculateScore(String playerName, int playerScore){
        System.out.println("Player:" + playerName + " Scored: " + playerScore + " Points");
        return (playerScore*10000);
    }
    public static int calculateScore(int playerScore){

        System.out.println("Player:" + "anonimo" + " Scored: " + playerScore + " Points");
        return (playerScore*10000);
    }
}
