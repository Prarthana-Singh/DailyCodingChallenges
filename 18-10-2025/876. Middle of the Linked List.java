/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // find the length of LL

        int len = 0;
        ListNode node = head;

        while(node!=null){
            node = node.next;
            len++;
        }
        int stopItr = len / 2;
        while(stopItr > 0){
            head = head.next;
            stopItr--;
        }

        return head;
    }
}
