package main;

import java.util.ArrayList;
import java.util.Scanner;
import toyproduct.Toy;
import toys.*;
import toys.SerialNumberGenerator;

public class kata6 {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        ToyBusiness toyBusiness = new ToyBusiness();
        
        System.out.println("Si desea construir un coche, presione car.");
        System.out.println("Si desea construir un helicoptero, escriba helicopter: ");
        
        Scanner input = new Scanner(System.in);
        String string = "";
        
        while(!string.equals("exit")){
            string = input.nextLine();       
            
            if (!string.equals("exit")){
                if(string.equals("car")){
                    toys.add(toyBusiness.createToy(string));
                    System.out.println("Producto procesado, coche");
                    System.out.println("Para salir escirba 'exit', en caso contrario continue");
                }else if(string.equals("helicopter")){
                    toys.add(toyBusiness.createToy(string));
                    System.out.println("Producto procesado, helicoptero");
                    System.out.println("Para salir escirba 'exit, en caso contrario continue");
                }else{
                    System.out.println("Este producto no existe en estos momentos");
                }
            }
        }
    }
    
}
