import AbstractFactory.*;

import static AbstractFactory.VolkswagenModel.POLO;

public class ContinentalFactory extends Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    Car buildVolkswagen(VolkswagenModel model) {
        switch (model) {
            case GOLF:
                return new Volkswagen(2021, 1.9, "Diesel", position);
            case POLO:
                return new Volkswagen(2021, 1.6, "Hybrid", position);
            case PASSAT:
                return new Volkswagen(2021,2.4,"Petrol", position);
            default:
                throw new IllegalArgumentException("unbekanntes Automodell");
        }
    }

    @Override
    Car buildSkoda(SkodaModel model) {
        switch (model) {
            case FABIA:
                return new Skoda(2021, 1.4, "Hybrid", position);
            case OCTAVIA:
                return new Skoda(2021, 1.8, "Petrol", position);
            case SUPERB:
                return new Skoda(2021, 2.2, "Hybrid", position);
            default:
                throw new IllegalArgumentException("unbekanntes Automodell");
        }
    }

}
