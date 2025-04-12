package org.example;

public class LogicA {


        /* 1-)When squirrels get together for a party, they like to have cigars.
         A squirrel party is successful when the number of cigars is between 40 and 60,
          inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
           Return true if the party with the given values is successful, or false otherwise.


                 cigarParty(30, false) → false
         cigarParty(50, false) → true
         cigarParty(70, true) → true
     }*/
        public boolean doParty(int numberOfCigars, boolean isWeekend) {
            if(isWeekend) {
                return numberOfCigars >= 40;
            }
            return numberOfCigars >= 40 && numberOfCigars <= 60;
        }
        /*2-)You are driving a little too fast, and a police officer stops you.
         Write code to compute the result, encoded as an int value: 0=no ticket,
          1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
           If speed is between 61 and 80 inclusive, the result is 1.
           If speed is 81 or more, the result is 2. Unless it is your birthday
           -- on that day, your speed can be 5 higher in all cases.


    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0*/
    public int catchSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
       if (speed <= 60) {return 0;}
       else if(speed <= 80) {return 1;}
       else {return 2;}
    }

    /*3-)
    The number 6 is a truly great number. Given two int values, a and b,
    return true if either one is 6. Or if their sum or difference is 6.
     Note: the function Math.abs(num) computes the absolute value of a number.


            love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true*/
    public boolean find6(int a, int b) {
        return (a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6);
    }

    /*4-)Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
     See also: Introduction to Mod


    more20(20) → false
    more20(21) → true
    more20(22) → true*/
    public boolean check20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    /*5-)Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
     Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
      See also: Introduction to Mod


    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true*/
    public boolean near10 (int num){
        return (num % 10 <= 2 ) || (num % 10 >= 8) ;
    }



    }



