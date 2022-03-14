package Guitars;

public class AcousticGuitar extends Guitars {

    public AcousticGuitar(String brand, String model, int year){
        super(brand, model, year);
    }

    @Override
    public void makeSound() {
        System.out.println("acoustic sound!!!");
    }
}
