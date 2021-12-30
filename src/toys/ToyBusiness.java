package toys;

import toyproduct.Toy;
import toyproduct.models.Car;
import toyproduct.models.Helicopter;

public class ToyBusiness {
    private final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        switch(type){
            case "car":
                Car car = new Car(this.serial.next());
                car.pack();
                car.label();
                return (Toy) car;
            case "helicopter":
                Helicopter helicopter = new Helicopter(this.serial.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;   
        }        
    }    
    
}