package CBuilder.NestedBuilder;

import CBuilder.NestedBuilder.models.Car;


public class Program {
    public static void main(String[] args){
        Car.Builder carBuilder = new Car.Builder();

        Car tesla = carBuilder
                .setMake("Tesla")
                .setModel("Model S")
                .setYear(2023)
                .setNumDoors(4)
                .setIsElectric()
                .build();

        Car dacia = carBuilder
                .setMake("Dacia")
                .setModel("Logan")
                .setYear(2023)
                .setNumDoors(4)
                .build();

        Car suzuki = carBuilder
                .setMake("Suzuki")
                .setModel("S-CROSS Strong Hybrid")
                .setYear(2023)
                .setNumDoors(4)
                .setIsHybrid()
                .build();

    }
}
