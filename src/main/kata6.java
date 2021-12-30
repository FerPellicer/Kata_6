package main;

import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import business.ToyBusiness;
import java.util.ArrayList;
import java.util.Scanner;
import toyproduct.Toy;

public class kata6 {

    public static void main(String[] args) {        
        ToyBusiness toyBusinessAm = new AmericanToyBusiness();
        ToyBusiness toyBusinessAs = new AsianToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        System.out.println("Si desea construir un coche en asia, presione American car.");
        System.out.println("Si desea construir un helicoptero, escriba American helicopter.");
        System.out.println("Si desea construir un coche en asia, presione Asian car.");
        System.out.println("Si desea construir un helicoptero, escriba Asian helicopter.");
        
        Scanner input = new Scanner(System.in);
        String string = "";
        
        while(!string.equals("exit")){
            string = input.nextLine();       
            
            if (!string.equals("exit")){
                switch (string) {
                    case "American car":
                        toys.add(toyBusinessAm.createToy(string));
                        System.out.println("Producto procesado, coche en América");
                        System.out.println("Para salir escirba 'exit', en caso contrario continue");
                        break;
                    case "American helicopter":
                        toys.add(toyBusinessAm.createToy(string));
                        System.out.println("Producto procesado, helicoptero en América");
                        System.out.println("Para salir escirba 'exit, en caso contrario continue");
                        break;
                    case "Asian car":
                        toys.add(toyBusinessAs.createToy(string));
                        System.out.println("Producto procesado, coche en Asia");
                        System.out.println("Para salir escirba 'exit', en caso contrario continue");
                        break;
                    case "Asian helicopter":
                        toys.add(toyBusinessAs.createToy(string));
                        System.out.println("Producto procesado, helicoptero en Asia");
                        System.out.println("Para salir escirba 'exit, en caso contrario continue");
                        break;
                    default:
                        System.out.println("Este producto no existe en estos momentos");
                        break;
                }
            }
        }
    }
    
}
