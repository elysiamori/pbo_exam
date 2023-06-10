package com.untirta.Valdy_Ramadhan;
//3337210027 Valdy Ramadhan

/**Sub-classes : Car
 * Super Variable : String typeVehicle, plat
 * Attribute : String nameCar
 * Method : getnameCar()
 * **/

public class Car extends Vehicle{
    private String nameCar;

    public Car(String nameCar, String plat, String typeVehicle){
        super(typeVehicle,plat);
        this.nameCar = nameCar;
    }
    public String getnameCar(){
        return nameCar; 
    }

    public void descVehicle(){
        super.descVehicle();
        System.out.println("Car Name : " + getnameCar());
        System.out.println("=============================");
    }
}
