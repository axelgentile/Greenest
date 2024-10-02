package Greenest;

public class CarnivorousPlant extends Plant implements AmountOfLiquid{

    public CarnivorousPlant(String nameOfPlant, double heightOfPlant, typeOfLiquid typeOfLiquid){
        super(nameOfPlant, heightOfPlant, typeOfLiquid);

    }

    @Override
    public double getAmountOfLiquid() {
        return 0.1 + (0.2 * getheightOfPlant());
    }
}
