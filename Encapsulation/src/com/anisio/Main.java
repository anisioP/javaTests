package com.anisio;

public class Main {

    public static void main(String[] args) {
	Player player = new Player();
	player.name = "Tim";
	player.health = 100;
	player.weapon = "Sword";

	int damage = 10;

	player.looseHelth(20);
	System.out.println("Remaning health: "+ player.healthRemaning());
	EnchancedPlayer enchancedPlayer = new EnchancedPlayer("Tim", 50, "Sword");
	System.out.println("Deafault health is: " + enchancedPlayer.getHealth());
    }

}
