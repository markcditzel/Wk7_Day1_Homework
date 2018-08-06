public class CandyFlossStall extends Stall implements ITicketed{

    //PROPERTIES
    // N/A

    //CONSTRUCTOR
    public CandyFlossStall(int rating, String name, String ownerName, int parkingSpot){
        super(rating, name, ownerName, parkingSpot);
    }

    //METHODS

    public double defaultPrice(){
        return 1.99;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 1.99;
    }
}
