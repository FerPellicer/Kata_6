package toys;

public class SerialNumberGenerator {
    
    private Integer serialNumber = 0;
    
    public int next() {
        return serialNumber++;
    }
}
