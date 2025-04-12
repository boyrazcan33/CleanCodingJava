package org.example;

public class RecursionA {
    /*1-)Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     Compute the result recursively (without loops).


    factorial(1) → 1
    factorial(2) → 2
    factorial(3) → 6*/
    public int findFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
     /* 2-)
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
     The even bunnies (2, 4, ..) we'll say have 3 ears,
     because they each have a raised foot.
      Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
}*/
    public int haveBunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + haveBunnyEars(bunnies - 1);
        } else {
            return 2 + haveBunnyEars(bunnies - 1);
        }
    }

    /*3-)
    Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     so for example 717 yields 2. (no loops).
      Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
       while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


    count7(717) → 2
    count7(7) → 1
    count7(123) → 0*/
    public int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

  /*  4-)
    Given a string, compute recursively (no loops)
     the number of lowercase 'x' chars in the string.


    countX("xxhixx") → 4
    countX("xhixhix") → 3
    countX("hi") → 0*/
    public int countX(String string){
        if (string.length() == 0) { return  0;}
        if (string.charAt(0) == 'x') {
            return 1 + countX(string.substring(1));
        } else {
            return countX(string.substring(1));
        }
    }

    /*5-)Given a string, compute recursively (no loops) a new string
    where all appearances of "pi" have been replaced by "3.14".


    changePi("xpix") → "x3.14x"
    changePi("pipi") → "3.143.14"
    changePi("pip") → "3.14p"*/
    public String changePi(String string) {
        if (string.length() < 2) {
            return string;
        }
        if (string.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(string.substring(2));
        } else {
            return string.charAt(0) + changePi(string.substring(1));
        }
    }








}


