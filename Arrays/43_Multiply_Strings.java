import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b = new BigInteger(num1);
        BigInteger c = new BigInteger(num2);
        BigInteger ar = b.multiply(c);
        
        String s = ar.toString();
        return s; 
    }
}