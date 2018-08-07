public abstract class Stall implements IReviewed{

    // PROPERTIES

    private int rating;
    private String name;
    private String ownerName;
    private int parkingSpot;

    // CONSTRUCTOR

    public Stall(int rating, String name, String ownerName, int parkingSpot){
        this.rating = rating;
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    //METHODS

    //GETTERS
    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }

    //SETTERS

    //OTHER
}
