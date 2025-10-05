Problem Statement: Given the root of a Binary Tree, write a recursive function that returns an array containing the preorder traversal of the tree.

Examples
                
                
Example 1:


                
Input:Binary Tree: 4 2 5 3 -1 7 6 -1 9 -1 -1 8 -1 1


<img width="882" height="1116" alt="image" src="https://github.com/user-attachments/assets/0be3c5d3-1d41-49d4-a0cb-0b0ef334b26f" />
                


                
Output: [4 2 3 9 1 5 7 6 8]


                
Explanation: We traverse the binary tree in the order of Root, Left then Right recursively resulting in the following traversal:
<img width="806" height="1092" alt="image" src="https://github.com/user-attachments/assets/bda1ea45-9b24-40c2-a7e4-3d0f895852eb" />


                



                
Example 2:


                
Input:Binary Tree: 1 2 3 4 5 6 7 -1 -1 8 -1 -1 -1 9 10
<img width="1052" height="1006" alt="image" src="https://github.com/user-attachments/assets/d4222458-5693-4522-b56c-deebc1721dff" />


                


                
Output: [1 2 4 5 8 3 6 7 9 10]


                
Explanation:  We traverse the binary tree in the order of Root, Left then Right recursively resulting in the following traversal:

<img width="1126" height="948" alt="image" src="https://github.com/user-attachments/assets/dcf1e6a5-341d-4f03-a3d0-cc9e357173b2" />

                



            
Disclaimer: Don’t jump directly to the solution, try it out yourself first.

Algorithm / Intuition
Preorder traversal is one of the depth-first traversal methods used to explore nodes in a binary tree. The algorithm first visits the root node then in the preorder traversal, we visit (ie. add to the array) the current node by accessing its value then we recursively traverse the left subtree in the same manner. We repeat these steps for the left subtree then when we return to the current node, we recursively travel to the right subtree in a preorder manner as well.The sequence of steps in preorder traversal follows: Root, Left, Right.
<img width="2320" height="2265" alt="image" src="https://github.com/user-attachments/assets/34fd25ea-ff14-471d-9b9e-012ecdd89538" />



Base Case: If the current node is null, it means we have reached the end of a subtree and there are no further nodes to explore. Hence the recursive function stops and we return from that particular recursive call.

Recursive Function:


Process Current Node: The recursive function begins by processing ie. adding to the array or printing the current node.
Traverse Left Subtree: Recursively traverse the left subtree by invoking the preorder function on the left child of the current node. This step continues the exploration of nodes in a depth first manner.
Traverse Right Subtree: After traversing the entire left subtree,we traverse the right subtree recursively. We once again invoke the preorder function, but this time on the right child of the current node.
<img width="1126" height="948" alt="image" src="https://github.com/user-attachments/assets/0e1903dd-f6b7-4ea1-a386-f61f925c6f0d" />

Algorithm:

Step 1: Check for base case that if the current node is null, exit the void function.
<img width="2362" height="614" alt="image" src="https://github.com/user-attachments/assets/9b1eb3c5-8527-4133-8cac-7bdbfb415921" />


Step 2: Push the value of the current node into the preorder traversal array.
<img width="2538" height="616" alt="image" src="https://github.com/user-attachments/assets/22d22542-d6ef-4595-af86-f71c021b69e5" />


Step 3: Invoke the preorder function on the left child then right child to traverse the left and right subtrees in the preorder manner respectively.
<img width="2504" height="618" alt="image" src="https://github.com/user-attachments/assets/4fece6fd-f964-43c9-9c89-400241826259" />

