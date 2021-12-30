package toys;

public class Helicopter {
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
    
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public String getType() {
        return this.type;
    }
       
    public void pack() {
        System.out.printf("\nPacking %s '%d'\n", this.type, this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling %s '%d'\n", this.type, this.serialNumber);
    }
}