package Inheritance;

import java.util.Scanner;

public class Car_5  extends Vehical_5 {
 
	String model_name;
	
	  Car_5(){
		AcceptDataCar();
		ShowDataCar();
	  }
	  Car_5(String s){
		setmodel_name(s);
	  }
	   public void ShowDataCar() {
		   ShowDataVehicall();
		   System.out.println(" CAR MODEL : "+getmodel_name());
	   }
	   public void AcceptDataCar() {
		   AcceptDataVehical();
		   Scanner car=new Scanner(System.in);
		   
		   System.out.println(" Enter your Car Model : ");
		   setmodel_name(car.next()); 
	   } 
	
	    public String getmodel_name() {
	    	return model_name;
	    }
        public void setmodel_name(String s) {
    	   model_name=s;
       }
        
}
