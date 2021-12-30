package branches;

import business.ToyBusiness;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {
    
    @Override
    public Toy createToy(String type){
        switch(type){
            case "Asian car":
                AsianCarToy car = new AsianCarToy(this.serial.next());
                car.pack();
                car.label();
                return car;
            case "Asian helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.serial.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;   
        }        
    }
}