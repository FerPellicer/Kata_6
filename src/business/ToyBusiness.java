package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    private final Map<String, ToyFactory> toys = new HashMap<>();
    private final SerialNumberGenerator serial =  new SerialNumberGenerator();
        
    public void add(String name, ToyFactory toyFactory){
        this.toys.put(name, toyFactory);
    }
    
    public Toy produceToy(String type){
        return this.toys.get(type).produceToy(serial.next());
    }  
}