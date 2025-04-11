package org.example;

public class WarmupAEleventoTwenty {
    /*11-)
    Given a non-empty string and an int N, return the string made starting with char 0,
     and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"*/
    public String addEveryNtChar(String string, int n) {
        String result = "";
        for (int i = 0; i < string.length(); i += n) {
            result += string.charAt(i);
        }

        return result;
    }

   /* 12-)
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
*/
    public boolean smileMonkeys(boolean aSmile, boolean bSmile){
        return !(aSmile ^ bSmile);

    }
    /*13-) We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/
    public boolean talkParrot(boolean talking, int hour){
        return talking && (hour < 7 || hour > 20);
    }

    /*14-)
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.


            posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true*/
    public boolean postNegative(int a, int b, boolean negative) {

            return negative ? (a < 0 && b < 0) : (a < 0 ^ b < 0);

    }

   /* 15-) Given a string, return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/
    public String frontBack(String string) {
        if (string.length() <= 1) {
            return string;
        }
        String firstChar = string.substring(0, 1);
        String lastChar = string.substring(string.length() - 1);
        String middlePart = string.substring(1, string.length() - 1);
        return lastChar + middlePart + firstChar;
    }

    /*16-) Return true if the given non-negative number is a multiple of 3
    or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


    or35(3) → true
    or35(10) → true
    or35(8) → false*/
    public boolean checkMultiple(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

   /* 17-)
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.


    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
*/
    public boolean calculateTempurature(int tempurature1 , int tempurature2){
        return (tempurature1 < 0 && tempurature2 > 100) || (tempurature1 > 100 && tempurature2 < 0);
    }

    /*18-)
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     Given 2 int values, return true if one or the other is teen, but not both.


    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/
    public boolean checkTeenager(int number1, int number2){
        return (number1 >= 13 && number1 <= 19) ^ (number2 >= 13 && number2 <= 19);
    }

    /*19-)
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include
    the second only if it is 'z', so "ozymandias" yields "oz".


    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/
    public String checkMixStart(String string) {
        String result = "";

        if (string.length() >= 1 && string.charAt(0)=='o') {
            result = result + string.charAt(0);
        }

        if (string.length() >= 2 && string.charAt(1)=='z') {
            result = result + string.charAt(1);
        }

        return result;
    }

    /*20-)
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
     or they are both in the range 40..50 inclusive.


            in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true*/
    public boolean findIn3050(int number1, int number2) {
        return (number1 >= 30 && number1 <= 40 && number2 >= 30 && number2 <= 40) ||
                (number1 >= 40 && number1 <= 50 && number2 >= 40 && number2 <= 50);
    }






}
