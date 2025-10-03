class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        return (int) ((fastPow(5, (n + 1) / 2) * fastPow(4, (n / 2)) % mod));


    }

    // use fast exp to calculate x^y % mod

    public long fastPow(long x, long y){

        long res = 1;
        long mult = x;
        while(y > 0){
            if(y % 2 == 1){
                res = (res * mult) % mod;
            }
            mult = (mult * mult) % mod;
            y /= 2;
        }
        return res;
    }
}
