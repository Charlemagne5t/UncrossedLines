package org.example;

// Think dynamic programming. Given an oracle dp(i,j) that tells us how many lines A[i:], B[j:]
// [the sequence A[i], A[i+1], ... and B[j], B[j+1], ...]
// are uncrossed, can we write this as a recursion
public class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        return 3;
    }
    private int maxUncrossedLinesHelper(int[] nums1, int[] nums2) {
        int count = 0;
        int newStart = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = newStart; j < nums2.length ; j++) {
                if(nums1[i] == nums2[j]){
                    count++;
                    newStart = j + 1;
                    break;
                }
            }
        }
        int count2 = 0;
        int newStart2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = newStart2; j < nums1.length ; j++) {
                if(nums2[i] == nums1[j]){
                    count2++;
                    newStart2 = j + 1;
                    break;
                }
            }
        }
        return Math.max(count2, count);
    }
}