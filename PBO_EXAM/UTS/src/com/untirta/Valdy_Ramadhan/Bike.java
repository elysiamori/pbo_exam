package com.untirta.Valdy_Ramadhan;
//3337210027 Valdy Ramadhan

/**Sub-clases : Bike
 * Attribute : String nameBike
 * Super Variable : String typeVehicle, plat
 * Method : getnameBike()
**/

public class Bike extends Vehicle {
    private String nameBike;
    
    public Bike(String nameBike, String plat, String typeVehicle){
        super(typeVehicle,plat);
        this.nameBike = nameBike;
    }   

    public String getnameBike(){
        return nameBike; 
    }

    public void descVehicle(){
        super.descVehicle();
        System.out.println("Bike Name : " + getnameBike());
        System.out.println("=============================");
    }

}
