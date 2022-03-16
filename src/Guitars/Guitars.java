package Guitars;

public abstract class Guitars implements Playable {
    private String brand;
    private String model;
    private int year;


    public Guitars(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void makeSound();
}
