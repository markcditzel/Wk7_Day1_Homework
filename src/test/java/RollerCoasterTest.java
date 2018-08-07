import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollercoaster1;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){
        visitor1 = new Visitor(11,146,0.00);
        visitor2 = new Visitor(13,144,0.00);
        visitor3 = new Visitor(22,176,100.50);
        rollercoaster1 = new RollerCoaster("Dipper", 20);
    }

    @Test
    public void doesRollercoasterHaveRating(){
        assertEquals(20, rollercoaster1.getRating());
    }

    @Test
    public void canUnderageAccessRollercoaster() {
        assertEquals(false, rollercoaster1.isAllowedTo(visitor1));
    }

    @Test public void canUnderheightAccessRollercoaster(){
        assertEquals(false, rollercoaster1.isAllowedTo(visitor2));
    }

    @Test public void canAllowedAccessRollercoaster(){
        assertEquals(true, rollercoaster1.isAllowedTo(visitor3));
    }
}
