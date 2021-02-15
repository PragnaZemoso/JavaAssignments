package Assignment6.Qtn1;

import java.util.ArrayList;
import java.util.List;

/**
 * A vampire number is a natural number with
 * 1. even number of digits. Lets call the number of digits : n
 * 2. You can obtain the number by multiplying two integers, x and y, each with n/2 digits.
 * - x and y are the fangs.
 * - Both fangs cannot end simultaneously in 0.
 * 3. The number can be made with all digits from x and y, in any order and only using each digit once.
 */

public class VampireNumber {

    List<String> permutations = new ArrayList<String>();
    private long fang1, fang2;


    public boolean checkIfVampireNumber(long number) {
        int n = String.valueOf(number).length();
        if (n % 2 != 0)
            return false;
        else {
            if (getAndValidateFangs(number, n))
                return true;
        }
        return false;
    }

    private boolean getAndValidateFangs(long number, int n) {
        String numberString = String.valueOf(number);
        Permutations p = new Permutations();
        p.getAllPermutations(numberString, 0, n - 1);
        permutations = p.numberPermutationsList;
        //System.out.println("Permutations of " + number + " = " + permutations);
        for (String permuteString : permutations) {
            String factor1String = permuteString.substring(0, n / 2);
            long factor1 = Long.parseLong(factor1String);
            String factor2String = permuteString.substring(n / 2);
            long factor2 = Long.parseLong(factor2String);
            if (((factor1 * factor2) == number) && !(factor1String.endsWith("0") && factor2String.endsWith("0"))) {
                this.fang1 = factor1;
                this.fang2 = factor2;
                return true;
            }
        }
        return false;
    }

    public void printFirstNVampireNumbers(int count) {
        //first vampire number 1260, so start = 1000 & end = 100000;
        long start = 1000;
        long end = 100000;
        if (count == 0)
            return;
        int vampireCount = 0;
        while (true) {
            long currNumber;
            for (currNumber = start; currNumber < end; currNumber++) {
                if (vampireCount == count) {
                    return;
                }
                if (checkIfVampireNumber(currNumber)) {
                    vampireCount++;
                    System.out.println(vampireCount + ". " + currNumber + "\t= " + this.fang1 + " * " + this.fang2);
                }
            }
            start *= 100;
            end *= 100;
        }
    }
}
