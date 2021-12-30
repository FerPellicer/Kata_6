package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    protected final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Toy produceToy(Integer serial) {
        Toy toy = this.createToy(serial);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serial);
}