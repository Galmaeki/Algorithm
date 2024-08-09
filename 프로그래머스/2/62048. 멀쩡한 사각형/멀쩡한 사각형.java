import java.math.BigInteger;

class Solution {
    public long solution(int w, int h) {
        long W = w;
        long H = h;
        long gcd = BigInteger.valueOf(W).gcd(BigInteger.valueOf(H)).longValue();

        return (W * H) - (W + H - gcd);
    }
}
