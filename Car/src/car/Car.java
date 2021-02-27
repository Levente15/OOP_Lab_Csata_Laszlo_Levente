package car;

import javax.print.DocFlavor;
import java.io.BufferedReader;

public class Car {
    private String carBrand;
    private String carType;
    private int numberOfKilometers;
    private int numberOfPassengers;
    private int yearOfManufacture;
    private int speed;
    private FuelType fuel;
    private Color color;


    public Car(String carBrand, String carType,int numberOfKilometers,int numberOfPassengers,int yearOfManufacture,
               int speed, FuelType fuel,Color color){
        this.carBrand=carBrand;
        this.carType=carType;
        this.numberOfKilometers=numberOfKilometers;
        this.numberOfPassengers=numberOfPassengers;
        this.yearOfManufacture=yearOfManufacture;
        this.speed=speed;
        this.fuel=fuel;
        this.color=color;


    }
    public  Car (String carBrand,String carType,int yearOfManufacture, int fuel, boolean family){
        this.carBrand=carBrand;
        this.carType=carType;
        this.yearOfManufacture=yearOfManufacture;
        this.numberOfKilometers=0;
        this.speed=0;

        if(family){
            this.numberOfPassengers=5;
        }else{
            this.numberOfPassengers=2;
        }
        switch (fuel){
            case 0: this.fuel=FuelType.PETROL; break;
            case 1: this.fuel=FuelType.DIESEL; break;
            case 2: this.fuel=FuelType.GAS; break;
            case 3: this.fuel=FuelType.ELECTRIC; break;
        }
        switch (Character.toUpperCase(carBrand.charAt(0))){
            case  'R': this.color=Color.RED; break;
            case 'G': this.color=Color.GREEN; break;
            case 'B': this.color=Color.BLUE; break;
            case 'W': this.color=Color.WHITE; break;
            default: this.color=Color.BLACK;
        }

    }

    //Getters

    public String getCarBrand() {
        return this.carBrand;
    }

    public String getCarType() {
        return this.carType;
    }
    public int getNumberOfKilometers(){
        return this.numberOfKilometers;
    }
    public int getNumberOfPassengers(){
        return this.numberOfPassengers;
    }
    public int getYearOfManufacture(){
        return this.yearOfManufacture;
    }
    public int getSpeed(){
        return this.speed;
    }

    //Setters
    public void setCarBrand(String carBrand){
        this.carBrand=carBrand;
    }
    public void setCarType(String carType) {
        this.carType =carType;
    }

    public void setNumberOfKilometers(int numberOfKilometers){
        this.numberOfKilometers=numberOfKilometers;
    }
     public void setYearOfManufacture(int yearOfManufacture){
        this.yearOfManufacture=yearOfManufacture;
    }
    public void setNumberOfPassengers(int numberOfPassengers){
        this.numberOfPassengers=numberOfPassengers;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
   public void changeSpeed(int speedIndicator) {
       if(this.speed+speedIndicator<0)
           return;
       this.speed=speedIndicator;
   }
   public void moveCar(int length){
        if(length<0)
            return;
        if(this.numberOfKilometers+length>200) {
           int remaining = numberOfKilometers + length - 200;
           this.resetMileage();
           this.numberOfKilometers = remaining;
        }else{
            this.numberOfKilometers+=length;
       }
       }


   public void resetMileage(){
        this.numberOfKilometers=0;
   }
    @Override
    public String toString() {
        return "This car is a " + this.carBrand + " " + this.carType + ((this.numberOfPassengers == 5) ? " family " : " two-seater ") + this.fuel +
        " car which was manufactured in " + this.yearOfManufacture + ". It has " + this.color +
                " color and the number of kilometers traveled is: " + this.numberOfKilometers;
     }
    }



