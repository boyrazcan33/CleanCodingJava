package org.example;

public class WarmupAOneToTen {

    /* 1-) The parameter weekday is true if it is a weekday, and the parameter vacation is true
     if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }

    /* 2-) Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0 */
    public int differenceTwentyOne(int number) {
        if (number <= 21) {
            return 21 - number;
        }
        return (number - 21) * 2;


    }


    /* 3-) Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


             nearHundred(93) → true
     nearHundred(90) → true
     nearHundred(89) → false*/
    public boolean nearHundred(int number) {
        return (Math.abs(100 - number) <= 10 || Math.abs(200 - number) <= 10);

    }

    /* 4-) Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


       missingChar("kitten", 1) → "ktten"
       missingChar("kitten", 0) → "itten"
       missingChar("kitten", 4) → "kittn"*/
    public String missCharOps(String string, int numberOfMissingChar) {
        String firstPart = string.substring(0, numberOfMissingChar);
        String secondPart = string.substring(numberOfMissingChar + 1);
        return firstPart + secondPart;
    }

    /*5-) Given a string, take the last char and return a new string with the last char added at the front and back,
     so "cat" yields "tcatt". The original string will be length 1 or more.


    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/
    public String addLastChar(String string) {
        String lastChar = string.substring(string.length() - 1);
        return lastChar + string + lastChar;
    }

    /*6-)
    Given a string, return true if the string starts with "hi" and false otherwise.


            startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/
    public boolean startHi(String string) {
        return string.length() >= 2 && string.substring(0, 2).equals("hi");
    }

    /* 7-) We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     Given 3 int values, return true if 1 or more of them are teen.


     hasTeen(13, 20, 10) → true
     hasTeen(20, 19, 10) → true
     hasTeen(20, 10, 13) → true*/
    public boolean hasTeen(int number1, int number2, int number3) {
        return (number1 >= 13 && number1 <= 19) ||
                (number2 >= 13 && number2 <= 19) ||
                (number3 >= 13 && number3 <= 19);

    }

    /*8-) Return true if the given string begins with "mix",
     except the 'm' can be anything, so "pix", "9ix" .. all count.


    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/
    public boolean checkMixStart(String string) {
        if (string.length() < 3) {
            return false;
        }
        return string.substring(1, 3).equals("ix");
    }

    /*9-) Given 2 int values, return whichever value is nearest to the value 10,
     or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


            close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/
    public int nearTen(int number1, int number2) {
        if (Math.abs(10 - number1) < Math.abs(10 - number2)) {
            return number1;
        } else if (Math.abs(10 - number1) > Math.abs(10 - number2)) {
            return number2;
        } else {
            return 0;

        }

    }

    /*10-) Return true if the given string contains between 1 and 3 'e' chars.


                stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false*/
    public boolean countE(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e')
                count++;
        }
        return count >= 1 && count <= 3;
    }


}
