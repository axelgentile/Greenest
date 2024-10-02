package Greenest;

import java.io.Serializable;

public class Palm extends Plant implements AmountOfLiquid {

    public Palm(String nameOfPlant, double heightOfPlant, typeOfLiquid typeOfLiquid) {
        super(nameOfPlant, heightOfPlant, typeOfLiquid);
    }


    @Override
    public double getAmountOfLiquid() {

        return 0.5 * getheightOfPlant();
    }
}
