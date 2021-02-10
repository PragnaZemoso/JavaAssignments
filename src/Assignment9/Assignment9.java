package Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        System.out.println("Enter a input sentence: ");
        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine();
        Sentence sentence = new Sentence();
        sentence.testSentencePatternMatch(inputSentence);

    }
}

class Sentence {
    public void testSentencePatternMatch(String input) {
        String regex = "^[A-Z].*[.]$";
        if (Pattern.matches(regex, input)) {
            System.out.println("YES, sentence '" + input + "' begins with a capital letter and ends with a period.");
        } else {
            System.out.println("NO, sentence '" + input + "' NOT begins with a capital letter and ends with a period.");
        }
    }
}
