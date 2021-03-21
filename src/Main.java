import AbstractFactory.Car;
import AbstractFactory.SkodaModel;
import AbstractFactory.VolkswagenModel;

public class Main {

    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car Vw = commonwealthFactory.buildVolkswagen(VolkswagenModel.PASSAT);
        System.out.println(Vw.getPosition());
        Car Skoda = continentalFactory.buildSkoda(SkodaModel.OCTAVIA);
        System.out.println(Skoda.getPosition());
    }
}
