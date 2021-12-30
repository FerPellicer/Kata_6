package main;

import java.util.ArrayList;
import java.util.Scanner;
import toys.*;
import toys.SerialNumberGenerator;

public class kata6 {

    public static void main(String[] args) {
        
        SerialNumberGenerator serial =  new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        System.out.print("Inserte instrucción: ");
        Scanner input = new Scanner(System.in);
        String string = "";
        
        while(!string.equals("exit")){
            string = input.nextLine();       
            
            if (!string.equals("exit")){
                Car car = new Car(serial.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Producto procesado");
                System.out.println("Para salir escirba 'exit'");
            }
        }
    }
    
}
