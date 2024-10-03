package Greenest;

public class Cactus extends Plant implements AmountOfLiquid{

public Cactus(String nameOfPlant, double heightOfPlant, typeOfLiquid typeOfLiquid) {
    super(nameOfPlant, heightOfPlant, typeOfLiquid); //ärver dessa från plant
}

    @Override
    public double getAmountOfLiquid() { //implementerat från interfacet
        return 0.2;
    }
}
