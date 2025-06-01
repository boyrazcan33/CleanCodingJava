package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicA logicA = new LogicA();

        //one
        System.out.println("Q1 : " + logicA.doParty(55, false));

        //two
        System.out.println("Q2 : " + logicA.catchSpeeding(65, true));

        //three
        System.out.println("Q3 : " + logicA.find6(1, 5));

        //four
        System.out.println("Q4 : " + logicA.check20(21));

        //five
        System.out.println("Q5 : " + logicA.near10(17));

        RecursionA recursionA = new RecursionA();
        //six
        System.out.println("Q6 : " + recursionA.findFactorial(5));

        //seven
        System.out.println("Q7 : " + recursionA.haveBunnyEars(5));

        //eight
        System.out.println("Q8 : " + recursionA.count7(7177));

        //nine
        System.out.println("Q9 : " + recursionA.countX("XOXxx"));

        //ten
        System.out.println("Q10 : " + recursionA.changePi("hipipiPIhihihihi"));

        CSAquestions csaquestions = new CSAquestions();
        //eleven
        System.out.println("Q11 : " + csaquestions.scoresIncreasing(new int[]{1, 3, 4,5,6,7,8,0}));

        //twelve
        System.out.println("Q12 : " + csaquestions.scoreAverage(new int[]{2, 2, 4, 4,5}));

        FunctionalA functionalA = new FunctionalA();
        //thirteen
        System.out.println("Q13 : " + functionalA.makeDouble(List.of(1, 2, 3, 4, 5)));

        //fourteen
        System.out.println("Q14 : " + functionalA.makeCopies(List.of("hey", "hru?", "ok!")));

        //fifteen
        System.out.println("Q15 : " + functionalA.rightDigit(List.of(1, 22, 93, 4, 5022)));

        //sixteen
        System.out.println("Q16 : " + functionalA.square(List.of(1, 2, 3, 4, 5)));

        //seventeen
        System.out.println("Q17 : " + functionalA.addY(List.of("no")));

        //eighteen
        System.out.println("Q18 : " + functionalA.lower(List.of("HELLO","OF COURSE","JAVA")));

        //nineteen
        System.out.println("Q19 : " + functionalA.addStar(List.of("hello", "there", "hi")));

        //twenty
        System.out.println("Q20 : " + functionalA.addOperations(List.of(1,3,6,9)));

        //twenty one
        System.out.println("Q21 : " + functionalA.deleteX(List.of("xXx", "yx", "zaa", "ax")));

        FunctionalB functionalB = new FunctionalB();
        //twenty two
        System.out.println("Q22 : " + functionalB.ommitNeg(List.of(1, -2, -5, 0)));

        CodingChallenge codingChallenge = new CodingChallenge();
        //twenty three
        System.out.println("Q23 : " + codingChallenge.findLengthMax("Hannah Montana"));

        //twenty four
        System.out.println("Q24 : " + codingChallenge.findSubbarraySum(new int[]{2,1,3}, 4));

        //twenty five
        System.out.println("Q25 : " + codingChallenge.findFirstUniqueCharacter("Burger Baba"));

        //twenty six
        System.out.println("Q26 : " + CodingChallenge.doBinarySearch(new int[]{1,3,5,6},7));

        //twenty seven
        System.out.println("Q27 : " + CodingChallenge.findMinCoins(new int[]{2, 7, 11, 15}, 99));

        //twenty eight
        System.out.println("Q28 : " + CodingChallenge.findMaxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));

        //twenty nine
        System.out.println("Q29 : " + CodingChallenge.measureLengthOfLongestSubstring("abcabcbb"));

        //thirty
        System.out.println("Q30 : " + Arrays.toString(CodingChallenge.sumSorted(new int[]{2, 7, 11, 15}, 9)));

        //thirty one
        System.out.println("Q31 : " + CodingChallenge.getSubarraySum(new int[]{2, 7, 11, 15}, 9));



    }
}