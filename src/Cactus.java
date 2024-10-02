package Greenest;

public class Cactus extends Plant implements AmountOfLiquid{

public Cactus(String nameOfPlant, double heightOfPlant, typeOfLiquid typeOfLiquid) {
    super(nameOfPlant, heightOfPlant, typeOfLiquid);
}

    @Override
    public double getAmountOfLiquid() {
        return 0.2;
    }
}
