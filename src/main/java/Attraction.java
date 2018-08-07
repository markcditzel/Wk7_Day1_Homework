import java.util.ArrayList;

public abstract class Attraction implements IReviewed{

    // PROPERTIES

    private String name;
    private int rating;

    // CONSTRUCTOR

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
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
