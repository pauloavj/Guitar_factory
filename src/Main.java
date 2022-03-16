import Guitars.acousticGuitar.AcousticGuitar;
import Guitars.eletricGuitar.ElectricGuitar;
import Guitars.Guitars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Guitars> myGuitars = new ArrayList<Guitars>();

        ElectricGuitar myElectricGuitar = new ElectricGuitar("Gibson","Les Paul",1988, "mono");
        AcousticGuitar myAcousticGuitar = new AcousticGuitar("Fender", "Stratocaster", 1992);

        myGuitars.add(myElectricGuitar);
        myGuitars.add(myAcousticGuitar);

        for (Guitars guitars: myGuitars) {
            guitars.makeSound();
        }
    }
}
