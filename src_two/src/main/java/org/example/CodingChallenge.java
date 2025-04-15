package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CodingChallenge {
    /*1- SLIDING WINDOWS : Given a string s,
     I want you to find the length of the longest substring without repeating characters.

    The substring must be contiguous, and characters are case-sensitive — so A and a are different.

    For example:

    Input: "abcabcbb" → Output: 3 (The answer is "abc")

    Input: "bbbbb" → Output: 1 (The answer is "b")

    Input: "pwwkew" → Output: 3 (The answer is "wke")*/
    public int findLengthMax(String string) {
        Set<Character> window = new HashSet<>();
        int start = 0;
        int maxLength = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for (int end = 0; end < string.length(); end++) {
            char c = string.charAt(end);
            while (window.contains(c)) {
                window.remove(string.charAt(start));
                start++;
            }
            window.add(c);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                bestStart = start;
                bestEnd = end;
            }
        }
        System.out.println(string.substring(bestStart, bestEnd + 1));

        return maxLength;
    }

    /*2-) TWO POINTERS: You are given a sorted array of integers called numbers,
     and a target integer target.
    Your task is to find two numbers in the array that add up to target,
     and return their 1-based indices.
    You must use the two-pointer approach, and the array is guaranteed to have exactly one solution.
            Input: numbers = [2, 7, 11, 15], target = 9
    Output: [1, 2] // because 2 + 7 = 9*/

    public static int[] findTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // try a bigger number
            } else {
                right--; // try a smaller number
            }
        }

        // Should never reach here because the problem guarantees one solution
        return new int[]{-1, -1};
    }

        /*3-) PREFIX SUM : You are given an array of integers nums
        and an integer k.
    Your task is to find the total number of continuous subarrays that sum to exactly k.
    Input: nums = [1, 1, 1], k = 2
    Output: 2
    Explanation: [1,1] at indices (0,1) and (1,2)*/
    //k is the interval what i am looking for
    public int findSubbarraySum (int[] numbers, int k){
        HashMap <Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);
        int sum = 0;
        int count = 0;
        for(int number : numbers){
            sum += number;

            if(prefixMap.containsKey(sum-k)){
                count += prefixMap.get(sum-k);
            }
            prefixMap.put(sum, prefixMap.getOrDefault(sum, 0)+1);
        }
        return count;
    }

/*
    4-) HASHMAP : Write a Java method that returns the first character in a string that appears only once.
    If there’s no such character, return "_".
    Input:  "engineering"
    Output: "g"   // because 'g' is the first character that shows up only once

    Input:  "aabbcc"
    Output: "_"   // all characters repeat
*/
    public char findFirstUniqueCharacter ( String string){
        HashMap<Character, Integer> collectMap = new HashMap<>();

        //Here I checked which charachter how many times counted
        for (int i = 0; i < string.length() ; i++) {
            char character = string.charAt(i);
            collectMap.put(character, collectMap.getOrDefault(character, 0) + 1);
                }
        for (int j = 0; j <string.length() ; j++) {
            char character = string.charAt(j);
            if (collectMap.get(character) == 1) {
                return character;

            }


        }
        return '_';


    }
    /*5-) BINARY SEARCH : You are given a sorted array of integers and a target value.
     Return the index if the target is found.
    If not, return the index where it would be inserted to keep the array sorted.
    Input: nums = [1,3,5,6], target = 5
    Output: 2

    Input: nums = [1,3,5,6], target = 2
    Output: 1

    Input: nums = [1,3,5,6], target = 7
    Output: 4*/
    public static int doBinarySearch(int [] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length -1;


        while(low <= high ) {
             int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];
            if (numberToFind == middleNumber){return middlePosition;}
            if (numberToFind <middleNumber ){
                high = middlePosition - 1 ;
            }
            else{
                low = middlePosition + 1 ;
            }


        }
        return low;

    }

   /* 6- GREEDY : You are given a list of coin denominations (e.g. [1, 5, 10, 25]) and a target amount (e.g. 87).
Return the minimum number of coins needed to make the amount, using as few coins as possible.
Assume you have unlimited supply of each coin.
Coins: [1, 5, 10, 25]
Amount: 87

Greedy Picks:
25 → 3 coins (75)
10 → 1 coin (85)
1  → 2 coins (87)
Total = 6 coins

*/
   public static int findMinCoins(int[] coins, int amount) {
       Arrays.sort(coins); // sort ascending first
       int count = 0;

       // loop from largest to smallest coin
       for (int i = coins.length - 1; i >= 0; i--) {
           int coin = coins[i];
           while (amount >= coin) {
               amount -= coin;
               count++;
           }
       }

       // if we reduced the amount to 0, return number of coins
       return amount == 0 ? count : -1; // -1 means we couldn't make the amount
   }




}

