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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1,temp2=list2;
        ListNode head=new ListNode(0);
        ListNode current=head;
        while(temp1!=null&&temp2!=null){
           if(temp1.val<temp2.val){
               current.next=temp1;
            temp1=temp1.next;
           }
           else{
               current.next=temp2;
               temp2=temp2.next;
           }
           current=current.next;
        }
        if(temp1!=null){
            current.next=temp1;
        }
        if(temp2!=null){
            current.next=temp2;
        }
        return head.next;
    }
}