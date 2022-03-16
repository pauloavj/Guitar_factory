package Guitars.acousticGuitar;

import Guitars.Guitars;

/**Acoustic guitar concrete child class which feeds Guitars abstract class*/
public class AcousticGuitar extends Guitars {

    /**Acoustic guitar constructor*/
    public AcousticGuitar(String brand, String model, int year){
        super(brand, model, year);
    }

    @Override
    public void makeSound() {
        System.out.println("acoustic sound!!!");
    }
}
