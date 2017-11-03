package com.anisio;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return ("No plot here...");
    }

    public String getName() {
        return name;
    }
}

class Jaws  extends Movie {
    public Jaws (){
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark that eats lots of people";
    }

}

class One extends Movie {
    public  One (){
        super("One");
    }

    @Override
    public String plot() {
        return "Coisas e cenas";
    }
}

class MazeRunner extends Movie{
    public  MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "lost in maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Jedi save the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i= 1; i < 11; i++ ){
            Movie movie = radomMovie();
            System.out.println("Movie #"+ i +
                             " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie radomMovie(){
       int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("random number i: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new One();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
