package business;

import toyproduct.Toy;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
}