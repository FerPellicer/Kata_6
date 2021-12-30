package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    protected final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Toy produceToy(String tipo) {
        Toy toy = this.createToy(tipo);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(String type);
}