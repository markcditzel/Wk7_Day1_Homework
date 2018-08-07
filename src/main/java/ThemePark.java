import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    //PROPERTIES

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedStuff;

    // CONSTRUCTOR

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewedStuff = new ArrayList<>();
    }

    //Method
    //ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed
    // Don't know how to populate an ArrayList<IReview> with those IReview ???objects?? I presume?
    //

    //

}


