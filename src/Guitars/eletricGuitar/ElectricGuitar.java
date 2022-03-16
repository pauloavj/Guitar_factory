package Guitars.eletricGuitar;

import Guitars.Guitars;

/**Electric guitar concrete child class which feeds Guitars abstract class*/
public class ElectricGuitar extends Guitars {
    private String pickups;

    /**Electric guitar constructor with an addition of pickups*/
    public ElectricGuitar(String brand, String model, int year, String pickups) {
        super(brand, model, year);//super call the constructor from the parent class
        this.pickups = pickups;
    }

    @Override
    public void makeSound() {
        System.out.println("Electric sound!!!");
    }
}
