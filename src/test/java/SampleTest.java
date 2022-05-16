import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class SampleTest{

    @Test
    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2, 1), "2 - 1 should equal 3");

    }
    @Test
    @DisplayName("2 - 1 = 1")
    void subtractsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1), "2 - 1 should equal 1");


    }
}