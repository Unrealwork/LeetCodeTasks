package flipinteger;


public class FlipInteger {
    //TODO: rewrite with bits operator
    public static int findComplement(int num) {
        int result = 0;
        int b;
        int twoDegree = 1;
        while (num != 0) {
            b = (num % 2 == 0) ? 1 : 0;
            result += twoDegree * b;
            twoDegree *= 2;
            num /= 2;
        }
        return result;
    }
}
