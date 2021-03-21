import AbstractFactory.Car;
import AbstractFactory.SkodaModel;
import AbstractFactory.VolkswagenModel;

public abstract class Factory {

    abstract Car buildVolkswagen(VolkswagenModel model);
    abstract Car buildSkoda(SkodaModel model);

}
