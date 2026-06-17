class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode post = null;
        ListNode curr = head;
        if(head==null||head.next==null){
            return head;

        }
         while(curr!=null){
            post=curr.next;
            curr.next=pre;
            pre=curr;
            curr=post;
         }
         return pre;

        
    }
}
