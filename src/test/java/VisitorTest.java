import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void canCreateVisitor(){
        Visitor visitor1 = new Visitor (5, 100, 50.00);
        assertEquals(5, visitor1.age);
    }
}
