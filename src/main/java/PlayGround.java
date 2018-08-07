public class PlayGround extends Attraction implements ISecurity{

    // PROPERTIES
    // N/A

    //CONSTRUCTOR
    public PlayGround(String name, int rating){
        super(name, rating);
    }

    //METHODS

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
            return true;
        } else {
            return false;
        }
    }



}// CLOSE INTERFACE
