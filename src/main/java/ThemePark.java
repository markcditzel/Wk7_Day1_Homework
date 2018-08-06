import java.util.ArrayList;

public class ThemePark {

    //PROPERTIES

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    // CONSTRUCTOR

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<>();
        this stalls = new ArrayList<>();
    }

    //Method

    public ArrayList<IReviewed> getAllReviewed(){
    }
}
