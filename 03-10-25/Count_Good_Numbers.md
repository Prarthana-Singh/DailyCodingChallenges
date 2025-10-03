### Problem Link - https://leetcode.com/problems/count-good-numbers/description/
---

## 🔹 Step 1: Understand the problem in simple words

We need to count **how many digit strings of length `n` are "good"**.
A **good string** means:

* Digits at **even positions (0, 2, 4, …)** → must be **even** (0, 2, 4, 6, 8) → **5 choices**.
* Digits at **odd positions (1, 3, 5, …)** → must be **prime digits (2, 3, 5, 7)** → **4 choices**.

So, the problem is really about multiplying choices for each position.

---

## 🔹 Step 2: Find the pattern

If `n = 1`:
Only one digit at index 0 → must be even → **5 options**.

If `n = 2`:

* index 0 (even) → 5 options
* index 1 (odd) → 4 options
  Total = `5 * 4 = 20`.

If `n = 3`:

* index 0 → 5 options
* index 1 → 4 options
* index 2 → 5 options
  Total = `5 * 4 * 5 = 100`.

If `n = 4`:

* index 0 → 5
* index 1 → 4
* index 2 → 5
* index 3 → 4
  Total = `5^2 * 4^2 = 400`.

So the formula is:

👉 **Total = (5 ^ count_even_positions) * (4 ^ count_odd_positions)**

---

## 🔹 Step 3: Count even and odd positions

If length = `n`:

* `count_even = ceil(n / 2)` (because index starts from 0)
* `count_odd = floor(n / 2)`

---

## 🔹 Step 4: Handle large `n` (up to 10^15 😱)

We cannot multiply directly because the number will be huge.
So we use **modular exponentiation (fast power)**.
That’s why the problem gives you **mod = 10^9 + 7**.

---

## 🔹 Step 5: Approach (summary)

1. Find `count_even = (n + 1) // 2`.
2. Find `count_odd = n // 2`.
3. Compute result = `(5^count_even % mod) * (4^count_odd % mod) % mod`.
4. Use **fast exponentiation** for large powers.

---

✅ Example check:
n = 4 → even = 2, odd = 2
Answer = `5^2 * 4^2 = 25 * 16 = 400` (correct).

n = 50 → very large number, but fast power helps compute.

---

