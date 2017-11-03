package com.anisio;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String color;

    public void setModel(String model){
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getDoors() != car.getDoors()) return false;
        if (getWheels() != car.getWheels()) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getEngine().equals(car.getEngine())) return false;
        return getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        int result = getDoors();
        result = 31 * result + getWheels();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getEngine().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }
}
