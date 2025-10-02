# Pow(x, n) Problem

## Problem Description
Implement a function `myPow(x, n)` to calculate `x` raised to the power `n` (`x^n`).  

You need to handle:
- Positive and negative powers  
- Large exponents  
- Edge cases like `Integer.MIN_VALUE`  

**Constraints:**
- `-100.0 < x < 100.0`
- `-2^31 <= n <= 2^31 - 1`
- Result fits in `-10^4 <= x^n <= 10^4`

**LeetCode Link:** [Pow(x, n)](https://leetcode.com/problems/powx-n/)

---

## Approaches

### **Approach 1 – Brute Force**
**Idea:** Multiply `x` repeatedly `n` times. If `n` is negative, multiply `1/x` instead.  

**Code File:** [`Pow(x,n)_Approach1.java`](https://github.com/Prarthana-Singh/DailyCodingChallenges/blob/main/02-10-2025/Pow(x%2C%20n).java)

**Explanation:**  
- Initialize `res = 1`  
- Loop `n` times: multiply `res` by `x` (or `1/x` for negative `n`)  
- Return `res`  

**Problem with this approach:**  
- Works for small numbers  
- **Fails / TLE** for large `n` like `10^9` because we do too many multiplications  

**Time Complexity:** O(|n|)  
**Space Complexity:** O(1)  

---

### **Approach 2 – Slightly Optimized Loop**
**Idea:** Same as brute force but structured differently for clarity.  

**Code File:** [`Pow(x,n)_Approach2.java`](https://github.com/Prarthana-Singh/DailyCodingChallenges/blob/main/02-10-2025/Pow(x%2C%20n).java)

**Explanation:**  
- Same logic as approach 1  
- Uses a forward loop instead of backward loop  

**Problem with this approach:**  
- Passed **207/307 test cases**, still **TLE for large `n`**  
- Shows that simple loops are **not enough** for big inputs  

**Time Complexity:** O(|n|)  
**Space Complexity:** O(1)  

---

### **Approach 3 – Iterative Fast Exponentiation**
**Idea:** Use **divide-and-conquer / fast exponentiation**:  
- If `n` is even → `x^n = (x^(n/2))^2`  
- If `n` is odd → `x^n = x * x^(n-1)`  

**Code File:** [`Pow(x,n)_Approach3.java`](https://github.com/Prarthana-Singh/DailyCodingChallenges/blob/main/02-10-2025/Pow(x%2C%20n).java)

**Explanation:**  
1. Convert `n` to long to handle `Integer.MIN_VALUE`  
2. If `n < 0`, set `x = 1/x` and `n = -n`  
3. Loop while `n > 0`:
   - If `n` is odd → multiply `res` by `x`  
   - Square `x`  
   - Divide `n` by 2  
4. Return `res`  

**Why this is better:**  
- Only **O(log n) multiplications** instead of `O(n)`  
- Passes **all test cases**, including very large `n`  

**Time Complexity:** O(log |n|)  
**Space Complexity:** O(1)  

---

### **Approach 4 – Recursive Fast Exponentiation**
**Idea:** Same divide-and-conquer logic as approach 3 but **implemented recursively**.  

**Code File:** [`Pow(x,n)_Approach4.java`](https://github.com/Prarthana-Singh/DailyCodingChallenges/blob/main/02-10-2025/Pow(x%2C%20n).java)

**Explanation:**  
1. Base case: `x^0 = 1`  
2. Recursive call for `x^(n/2)`  
3. Combine result:
   - If `n` is even → `half * half`  
   - If `n` is odd → `half * half * x`  

**Why this is better:**  
- Elegant, clean, easier to understand recursion  
- Still **O(log n)** time  
- Uses recursion stack → **O(log n)** space  

---

## Key Takeaways
1. **Start simple:** Brute force is easy to implement and understand.  
2. **Analyze failures:** Large inputs → TLE  
3. **Optimize smartly:** Divide-and-conquer reduces time from `O(n)` → `O(log n)`  
4. **Handle edge cases:** Negative powers, `Integer.MIN_VALUE`  
5. **Iterative vs Recursive:** Iterative saves stack space, recursion is visually cleaner  

---

