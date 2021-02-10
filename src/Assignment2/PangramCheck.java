package Assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class PangramCheck {

    public void checkIfPangram(String input) {
        HashSet<Character> letters = new HashSet<>();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.charAt(i));
        }

        if (letters.size() == 26)
            System.out.println("Given input contains all letters of Alphabet, " + input + " is a Pangram");
        else
            System.out.println("Given input " + input + " is NOT a Pangram");
    }
}

class Assignment2 {
    public static void main(String[] args) {
        PangramCheck pangramCheck = new PangramCheck();
//        pangramCheck.checkIfPangram("abcdefghijklmnopqrstuvwxyz");
//        pangramCheck.checkIfPangram("hhhlaln");
//        pangramCheck.checkIfPangram("qwertyuiopasdfghjklzxcvbnm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input String: ");
        String inputString = sc.next();
        pangramCheck.checkIfPangram(inputString);
    }
}
