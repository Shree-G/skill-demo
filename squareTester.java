//imports necessary JUnit tester addons
import static org.junit.Assert.*;
import org.junit.*;

public class squareTester {
    
    @Test
    public void squareTest(){
        assertEquals(4, square.getTheSquare(4)); //failing test!
    }
}
