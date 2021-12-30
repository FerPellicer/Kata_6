package main;

import java.util.ArrayList;
import java.util.Scanner;
import toys.*;
import toys.SerialNumberGenerator;

public class kata6 {

    public static void main(String[] args) {
        
        SerialNumberGenerator serial =  new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        System.out.println("Si desea construir un coche, presione car.");
        System.out.println("Si desea construir un helicoptero, escriba helicopter: ");
        
        Scanner input = new Scanner(System.in);
        String string = "";
        
        while(!string.equals("exit")){
            string = input.nextLine();       
            
            if (!string.equals("exit")){
                if(string.equals("car")){
                    Car car = new Car(serial.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Producto procesado, coche");
                    System.out.println("Para salir escirba 'exit', en caso contrario continue");
                }else if(string.equals("helicopter")){
                    Helicopter helicopter = new Helicopter(serial.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Producto procesado, helicoptero");
                    System.out.println("Para salir escirba 'exit, en caso contrario continue");
                }else{
                    System.out.println("Este producto no existe en estos momentos");
                }
            }
        }
    }
    
}
