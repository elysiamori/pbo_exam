package com.untirta.Valdy_Ramadhan;
//3337210027 Valdy Ramadhan

/**
 * Super : Vehicle
   Attribute : String typeVehicle, plat
   Attribute final String : nim
   Method : descVehicle()
   Constructor : Vehicle()
**/


public class Vehicle {
    private String typeVehicle, plat;
    private final String nimName;
    
    //constructor
    public Vehicle(){
        this.nimName = "3337210027 Valdy Ramadhan";
    }
    //end constructor

    public Vehicle(String typeVehicle, String plat){
        this.typeVehicle = typeVehicle;
        this.plat = plat;
        this.nimName = "3337210027 Valdy Ramadhan";
    }//end constructor

   protected void descVehicle(){
        System.out.println(this.nimName +"\n"+"Transportation Type : " + this.typeVehicle + "\n" + 
        "Plat Number : " + this.plat);
   }//end method
}
