package toyproduct.models;

import toyproduct.Toy;

public class Helicopter implements Toy{
    private final Integer serialNumber;
    final String type = "helicopter";
    
    /**
     * Constructor al que se le pasa el parámetro que referencia el serial de 
     * un helicóptero.
     * 
     * @param serialNumber 
     */
    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    public String getType() {
        return this.type;
    }
       
    @Override
    public void pack() {
        System.out.printf("\nPacking %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public String toString() {
        return "HelicopterToy {" + "serialNumber = " + serialNumber + '}';
    }
}