package edu.boychuk.oop1;

/**
 * Created by Sergey on 17-Feb-16.
 */
public class Car {
    private String model;
    private int maxSpeed;
    private int year;
    private int speed;
    //...
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    //...
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public  int getSpeed(){
        return speed;
    }
    //...
}
