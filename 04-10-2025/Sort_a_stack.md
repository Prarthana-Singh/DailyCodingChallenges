
---

### 🔎 Problem: https://www.geeksforgeeks.org/problems/sort-a-stack/1

We are given a **stack of integers**.
We need to sort it in **ascending order**, but since the **bottom** of the stack should hold the **smallest element**, the final stack will look like this:

👉 Bottom → Smallest … Largest → Top

Example:
`[41, 3, 32, 2, 11]`
➡ Sorted stack: `[41, 32, 11, 3, 2]`
<img width="901" height="423" alt="image" src="https://github.com/user-attachments/assets/ba1d70a0-4bfc-41bf-9444-b9400897a10a" />

---

### 🛠️ Approaches:

#### **1. Brute Force (Using Extra Space - Array/Vector)**

* Pop all elements from the stack into an array/list.
* Sort the array (using built-in sort).
* Push the sorted elements back into the stack.
* Time: **O(n log n)**, Space: **O(n)**.

👉 Simple, but not the “stack-only” solution.

---

#### **2. Recursive Approach (Without Extra Array)** ✅ (Interview Friendly)

We can use recursion to sort the stack in-place:

**Idea:**

1. Pop the top element.
2. Recursively sort the remaining stack.
3. Insert the popped element back into the sorted stack at the correct position.

To insert correctly:

* If stack is empty or top ≤ element → push element.
* Else pop top, recursively insert element, then push top back.

This way, recursion simulates another stack.

---

#### **3. Iterative with Two Stacks**

* Use an auxiliary stack (`tempStack`).
* While popping elements from original stack, place them in `tempStack` in sorted order (like insertion sort).
* Finally, copy elements back to original stack.
* Time: **O(n²)**, Space: **O(n)**.

---
