package CBuilder.NestedBuilder.models;

import CBuilder.NestedBuilder.interfaces.IBuilder;

public class Car {
    private String make;
    private String model;
    private int year;
    private int numDoors;
    private boolean isElectric = false;
    private boolean isHybrid = false;

    //The constructors have to be private
    private Car() {
    }
    private Car(String make, String model, int year, int numDoors, boolean isElectric, boolean isHybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numDoors = numDoors;
        this.isElectric = isElectric;
        this.isHybrid = isHybrid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numDoors=" + numDoors +
                ", isElectric=" + isElectric +
                '}';
    }

    public static class Builder implements IBuilder<Car> {
        private Car builtCar;

        public Builder() {
            builtCar = new Car();
        }

        public Builder setMake(String make){
            builtCar.make = make;
            return this;
        }

        public Builder setModel(String model){
            builtCar.model = model;
            return this;
        }

        public Builder setYear(int year){
            builtCar.year = year;
            return this;
        }

        public Builder setNumDoors(int numDoors){
            builtCar.numDoors = numDoors;
            return this;
        }

        public Builder setIsElectric(){
            builtCar.isElectric = true;
            return this;
        }

        public Builder setIsHybrid(){
            builtCar.isHybrid = true;
            return this;
        }
        @Override
        public Car build() {
            return builtCar;
        }
    }
}
