package com.Strings;

public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs) {

        String small=shortest(strs);
        System.out.println(small);
        System.out.println();
        int index=small.length();
for(int i=0;i< strs.length;i++){
    int j=0;
    for ( j = 0; j < small.length(); j++)
        if(small.charAt(j)!=strs[i].charAt(j)) break;
        if(index>j) index=j;

    }
        return small.substring(0,index);}

    public static String shortest(String[] strs) {
        String small=strs[0];

        for (int i = 1; i < strs.length ; i++) {
            if(small.length()>strs[i].length()) small=strs[i];

        }
        return small;
    }

    public static void main(String[] args) {
        String[] strs= {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));

    }


}
