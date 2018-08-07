import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall1;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        visitor1 = new Visitor(8, 100, 1);
        visitor2 = new Visitor(101, 178, 100);
        tobaccoStall1 = new TobaccoStall(10, "Fags", "Bob", 11);

    }


    @Test
    public void canCreateTobaccoStall(){
        TobaccoStall tobaccoStall1 = new TobaccoStall(1,"Fags","Bob", 11);
    }

    @Test
    public void doesTobaccoStallHaveRating(){
        assertEquals(10, tobaccoStall1.getRating());
    }

    @Test
    public void canUnderageAccessTobaccoStall_FALSE(){
        assertEquals(false, tobaccoStall1.isAllowedTo(visitor1));
    }

    @Test
    public void canAllowedAccessTobacoStallTRUE(){
        assertEquals(true, tobaccoStall1.isAllowedTo(visitor2));
    }


}
