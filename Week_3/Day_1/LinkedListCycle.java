public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if( head==null ||head.next==null){
            return false;
        }
        while (fast!=null){
            if(slow.next==null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast==slow)
            return true;
        }
        return false;
        
    }
}
