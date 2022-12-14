public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr = headA;
        ListNode ptrB;
        int lenA = 0;
        int lenB = 0;
        while(ptr != null){
            ptr = ptr.next;
            lenA++;
        }
        ptr = headB;
        while(ptr != null){
            ptr = ptr.next;
            lenB++;
        }

        int diff = Math.abs(lenA-lenB);
        if(lenA > lenB){
            ptr = headA;
            ptrB = headB;
        }else{
            ptr = headB;
            ptrB = headA;
        }
        while(ptr != null && diff != 0){
            ptr = ptr.next;
            diff--;
        }
        while(ptr != null && ptr != ptrB){
            ptr = ptr.next;
            ptrB = ptrB.next;
        }
        return ptr;
    }
}
