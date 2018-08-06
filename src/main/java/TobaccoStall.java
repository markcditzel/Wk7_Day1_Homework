public class TobaccoStall extends Stall implements ITicketed, ISecurity{
    //PROPERTIES
    // N/A

    //CONSTRUCTOR
    public TobaccoStall(int rating, String name, String ownerName, int parkingSpot){
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

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge()) >= 18) {
    return true;
        }

    }
}
