package org.example;

public class CSAquestions {
    /*1-)Given an array of scores, return true
    if each score is equal or greater than the one before.
     The array will be length 2 or more.


    scoresIncreasing([1, 3, 4]) → true
    scoresIncreasing([1, 3, 2]) → false
    scoresIncreasing([1, 1, 4]) → true*/
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*2-)
    Given an array of scores, compute the int average of the first half and the second half,
     and return whichever is larger. We'll say that the second half begins at index length/2.
      The array length will be at least 2. To practice decomposition, write a separate helper method
    int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end.
     Call your helper method twice to implement scoresAverage().
      Write your helper method after your scoresAverage() method in the JavaBat text area.
       Normally you would compute averages with doubles, but here we use ints so the expected results are exact.


        scoresAverage([2, 2, 4, 4]) → 4
        scoresAverage([4, 4, 4, 2, 2, 2]) → 4
        scoresAverage([3, 4, 5, 1, 2, 3]) → 4*/
    public int scoreAverage(int[] scores) {
        int mid = scores.length / 2;
        int firstHalfAverage = average(scores, 0, mid);
        int secondHalfAverage = average(scores, mid, scores.length);
        return Math.max(firstHalfAverage, secondHalfAverage);

    }

    private int average(int[] scores, int i, int mid) {
        int sum = 0;
        for (int j = i; j < mid; j++) {
            sum += scores[j];
        }
        return sum / (mid - i);
    }

}
