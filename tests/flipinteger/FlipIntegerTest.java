package flipinteger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FlipIntegerTest {
    @DataProvider
    private Object[][] provideFlipIntegerTest() {
        return new Object[][]{
                {5, 2},
                {1, 0}
        };
    }

    @Test(dataProvider = "provideFlipIntegerTest")
    public void testFindComplement(int num, int expectedFlipped) throws Exception {
        String assertMessage = String.format(
                "Incorrect flipped integer for %d",
                num
        );
        assertEquals(FlipInteger.findComplement(num), expectedFlipped, assertMessage);
    }

}