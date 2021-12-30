package toys;

public class ToyBusiness {
    private final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Car createCar() {
        Car car = new Car(this.serial.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(this.serial.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;    
    }
    
}