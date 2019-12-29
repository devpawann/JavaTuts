package Assignments;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Logio used is first string is sorted and checked if both are same of not
        String one = String.valueOf("abcd");
        String two = String.valueOf("dbca");
        char[] arr1 = one.toCharArray();
        char[] arr2 = two.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram=true;
        if(arr1.length==arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=arr2[i]){
                    isAnagram=false;
                }
            }
        }

        if (isAnagram){
            System.out.println("Yes they are anagram");
        }else {
            System.out.println("No they are not anagram");
        }


    }
}
