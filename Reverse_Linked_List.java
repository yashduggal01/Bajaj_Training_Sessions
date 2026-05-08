class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            // Store next node
            ListNode nextTemp = curr.next;
            // Reverse the link
            curr.next = prev;
            // Move prev and curr forward
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}
