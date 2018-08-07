import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayGroundTest {

    PlayGround playground1;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        visitor1 = new Visitor(8, 100, 1);
        visitor2 = new Visitor(101, 178, 100);
        playground1 = new PlayGround("Funland", 5);
    }

    @Test
    public void canOverageAccessPlayground(){
        assertEquals(false, playground1.isAllowedTo(visitor2));
    }

    @Test
    public void canUnderageAccessPlayground(){
        assertEquals(true, playground1.isAllowedTo(visitor1));
    }


}
