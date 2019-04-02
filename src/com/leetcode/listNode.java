package com.leetcode;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (46.40%)
 * Total Accepted:    540.2K
 * Total Submissions: 1.2M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head, tail;
        head = new ListNode(0);
        tail = head;
        while(l1 != null && l2 !=null){
            if(l1.val <= l2.val){
                tail.next = new ListNode(l1.val);
                tail = tail.next;
                l1 = l1.next;
            }
            else {
                tail.next = new ListNode(l2.val);
                tail = tail.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            tail.next = new ListNode(l1.val);
            tail = tail.next;
            l1 = l1.next;
        }

        while(l2 != null){
            tail.next = new ListNode(l2.val);
            tail = tail.next;
            l2 = l2.next;
        }
        return head.next;
    }
}
