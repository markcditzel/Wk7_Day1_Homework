public class RollerCoaster extends Attraction implements ISecurity{
    // PROPERTIES
    // N/A

    //CONSTRUCTOR
    public RollerCoaster(String name, int rating){
        super(name, rating);
    }

    //METHODS

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && (visitor.getHeight() >145)) {
            return true;
        } else {
            return false;
        }
    }

}

