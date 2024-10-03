package Greenest;

public abstract class Plant implements AmountOfLiquid{

    enum typeOfLiquid{KRANVATTEN, MINERALVATTEN, PROTEINDRYCK;} //enum
    private String nameOfPlant;
    private double heightOfPlant;
    private typeOfLiquid typeOfLiquid; //inkasapsling

    public Plant(String nameOfPlant, double heightOfPlant, typeOfLiquid typeOfLiquid){
        this.nameOfPlant = nameOfPlant;
        this.heightOfPlant = heightOfPlant;
        this.typeOfLiquid = typeOfLiquid;

    }
    public String getNameOfPlant(){
        return nameOfPlant;
    }
    public double getheightOfPlant(){
        return heightOfPlant;

    }
    public typeOfLiquid getTypeOfLiquid(){
        return typeOfLiquid;

    }

}

