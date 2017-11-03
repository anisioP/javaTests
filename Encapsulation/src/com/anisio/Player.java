package com.anisio;

public class Player {

    public String name;
    public int health;
    public String weapon;


    public void looseHelth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
        }

    }

    public int healthRemaning(){
        return this.health;
    }
}
