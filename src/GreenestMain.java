package Greenest;
import javax.swing.*;

public class GreenestMain {


    public static void main(String[] args) {

        String plantToWater = JOptionPane.showInputDialog(null, "Vilken växt villl du vattna?");

        Plant[] plants = {
                new Cactus("Igge", 0.2, Plant.typeOfLiquid.MINERALVATTEN),
                new CarnivorousPlant("Meatloaf", 0.7, Plant.typeOfLiquid.PROTEINDRYCK),
                new Palm("Laura", 5, Plant.typeOfLiquid.KRANVATTEN),
                new Palm("Olof", 1, Plant.typeOfLiquid.KRANVATTEN)};

        for (Plant plant : plants) {
            if (plant.getNameOfPlant().equalsIgnoreCase(plantToWater)) {
                JOptionPane.showMessageDialog(null, plant.getNameOfPlant() + " behöver " + plant.getAmountOfLiquid() +
                        " liter " + plant.getTypeOfLiquid().toString().toLowerCase() + " per dag.");
                return;
            }
        }

            JOptionPane.showMessageDialog(null, "Det finns ingen växt som heter " + plantToWater);



        }
    }



