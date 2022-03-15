package Guitars.eletricGuitar;

import Guitars.Guitars;

public class ElectricGuitar extends Guitars {
    private String output;//mono or stereo

    public ElectricGuitar(String brand, String model, int year, String output) {
        super(brand, model, year);
        this.output = output;
    }

    @Override
    public void makeSound() {
        System.out.println("Electric sound!!!");
    }
}
