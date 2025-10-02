
---

## **Approach 1 – Brute Force (Positive & Negative n)**

class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;  // Initialize result

        if(n > 0) {
            // Multiply x, n times for positive powers
            for(int i = n; i >= 1; i--){
                res = x * res;
            }
        }
        else if(n < 0){
            n = -n; // Make n positive for calculation
            // Multiply 1/x, n times for negative powers
            for(int i = 0; i < n; i++){
                res = (1/x) * res;
            }
        }

        return res;  // Return the final result
    }
}
```

* Time Complexity: `O(|n|)`
* Space Complexity: `O(1)`
* Works for small `n`, **fails/TLE** for large `n`.

----------------------------------------------------------------------------------------------------------------

## **Approach 2 – Slightly Optimized Loop (your second attempt)**

class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;  // Initialize result

        if(n > 0){
            // Multiply x, n times
            for(int i = 0; i < n; i++){
                res *= x;
            }
        } else if(n < 0){
            n = -n;  // Convert n to positive
            // Multiply 1/x, n times
            for(int i = 0; i < n; i++){
                res *= (1/x);
            }
        }

        return res;  // Return final answer
    }
}
```

* Passed **294/307 test cases**.
* Similar time complexity: `O(|n|)` → not enough for large `n`.

--------------------------------------------------------------------------------------------------------------------

## **Approach 3 – Iterative Fast Exponentiation**

class Solution {
    public double myPow(double x, int n) {
        long N = n;  // Convert to long to handle Integer.MIN_VALUE

        if (N < 0) {  // Handle negative powers
            x = 1 / x;
            N = -N;
        }

        double res = 1.0;  // Initialize result
        while (N > 0) {
            if (N % 2 == 1) res *= x; // If N is odd, multiply res by x
            x *= x;   // Square x for next iteration
            N /= 2;   // Reduce exponent by half
        }

        return res;  // Return final result
    }
}
```


* Time Complexity: `O(log |n|)`
* Space Complexity: `O(1)`
* Efficient, passes **all test cases**.

------------------------------------------------------------------------------------------------------------------------------------

## **Approach 4 – Recursive Fast Exponentiation**

class Solution {
    public double myPow(double x, int n) {
        long N = n;  // Convert to long to avoid overflow
        if (N < 0) { // Handle negative powers
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);  // Call recursive helper
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0; // Base case: x^0 = 1

        double half = fastPow(x, n / 2); // Recursive call for half exponent

        if (n % 2 == 0) {
            return half * half;  // Even exponent
        } else {
            return half * half * x; // Odd exponent
        }
    }
}
```


* Time Complexity: `O(log |n|)`
* Space Complexity: `O(log |n|)` (recursion stack)
* Elegant, clear, and passes **all test cases**.

---------------------------------------------------------------------------------------------------------------------------

---


