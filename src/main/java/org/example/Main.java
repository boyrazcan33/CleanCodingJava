package org.example;

public class Main {
    public static void main(String[] args) {
        //One
        CodingOverviewWarmupAOneToFive codingOverviewWarmupAOneToFive = new CodingOverviewWarmupAOneToFive();
        System.out.println(codingOverviewWarmupAOneToFive.sleepIn(false, false)); // true
        System.out.println(codingOverviewWarmupAOneToFive.sleepIn(true, false)); // false
        System.out.println(codingOverviewWarmupAOneToFive.sleepIn(false, true)); // true

        //Two
        System.out.println(codingOverviewWarmupAOneToFive.differenceTwentyOne(23));
        System.out.println(codingOverviewWarmupAOneToFive.differenceTwentyOne(19));

        //Three
        System.out.println(codingOverviewWarmupAOneToFive.nearHundred(24));

        //Four
        System.out.println(codingOverviewWarmupAOneToFive.missingCharOps("kitten", 5));
        // kitte

        //Five
        System.out.println(codingOverviewWarmupAOneToFive.lastCharAdd("Batman"));


    }
}