package tasks;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Test for tasks form LeetCode
 */
public class SolutionTest {

    private static int calcDigitsSum(int n) {
        int result = n;
        int buf = 0;
        while (result >= 10) {
            while (result != 0) {
                buf += result % 10;
                result /= 10;
            }
            result = buf;
            buf = 0;
        }
        return result;
    }

    @Test
    public void testAddDigits() throws Exception {
        int MAX_NUM = 1000;
        for (int i = 0; i < MAX_NUM; i++) {
            assertEquals(calcDigitsSum(i), Solution.addDigits(i));
        }
    }
}