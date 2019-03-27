/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.14%)
 * Total Accepted:    427.8K
 * Total Submissions: 1.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 *
 * Example 2:
 *
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 */




class Solution {

    public int getIndexOfShortestString(String[] strs){
        int index = 0;
        int smallest = strs[0].length();
        for(int i = 1 ; i < strs.length; i++){
            if(strs[i].length() < smallest){
                smallest = strs[i].length();
                index = i;
            }
        }
        return index;
    }


    public String longestCommonPrefix(String[] strs) {
        if(strs == null||strs.length == 0)return "";
        int loopNum = getIndexOfShortestString(strs);
        for(int i = 0; i<strs[loopNum].length();i++){
            char base = strs[loopNum].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i)!=base)
                    return strs[loopNum].substring(0,i);

            }

        }
        return strs[loopNum];
    }
}

