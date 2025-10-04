// ✅ Approach 1: Using Extra Array/Vector (Simple & Fast)

 public static void sortStack(Stack<Integer> st) {
        // Transfer stack to array
        List<Integer> list = new ArrayList<>();
        while (!st.isEmpty()) {
            list.add(st.pop());
        }

        // Sort the array
        Collections.sort(list);

        // Push back sorted elements (largest at top, smallest at bottom)
        for (int x : list) {
            st.push(x);
        }
    }

=========================================================================================

  ✅ Approach 2: Recursive Approach (No Extra Array)


  // Function to sort stack
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        // Remove top element
        int top = st.pop();

        // Sort remaining stack
        sortStack(st);

        // Insert element in sorted order
        insertSorted(st, top);
    }

    // Helper function to insert element in correct position
    private static void insertSorted(Stack<Integer> st, int element) {
        if (st.isEmpty() || st.peek() <= element) {
            st.push(element);
            return;
        }

        int top = st.pop();
        insertSorted(st, element);
        st.push(top);
    }


==================================================================================================

  ✅ Approach 3: Using Two Stacks (Iterative Method)

   public static void sortStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            int curr = st.pop();

            // Place curr in correct position in temp stack
            while (!temp.isEmpty() && temp.peek() > curr) {
                st.push(temp.pop());
            }

            temp.push(curr);
        }

        // Copy back to original stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
