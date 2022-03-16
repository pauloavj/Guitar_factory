import Guitars.acousticGuitar.AcousticGuitar;
import Guitars.eletricGuitar.ElectricGuitar;
import Guitars.Guitars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a array of guitars which will store guitar types
        ArrayList<Guitars> myGuitars = new ArrayList<Guitars>();

        // Create guitar objects
        ElectricGuitar myElectricGuitar = new ElectricGuitar("Gibson","Les Paul",1988, "mono");
        AcousticGuitar myAcousticGuitar = new AcousticGuitar("Fender", "Stratocaster", 1992);

        // Add the guitars to the array of guitars
        myGuitars.add(myElectricGuitar);
        myGuitars.add(myAcousticGuitar);

        // print the sound of all guitars
        for (Guitars guitars: myGuitars) {
            guitars.makeSound();
        }
    }
}
