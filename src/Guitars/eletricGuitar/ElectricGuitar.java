package Guitars.eletricGuitar;

import Guitars.Guitars;

public class ElectricGuitar extends Guitars {
    private String pickups;//mono or stereo

    public ElectricGuitar(String brand, String model, int year, String pickups) {
        super(brand, model, year);
        this.pickups = pickups;
    }

    @Override
    public void makeSound() {
        System.out.println("Electric sound!!!");
    }
}
