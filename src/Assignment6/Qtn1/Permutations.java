package Assignment6.Qtn1;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    List<String> numberPermutationsList = new ArrayList<String>();

    public void getAllPermutations(String number, int begin, int end) {
        if (begin == end) {
            numberPermutationsList.add(number);
        } else {
            for (int i = begin; i <= end; i++) {
                number = swap(number, begin, i);
                getAllPermutations(number, begin + 1, end);
                number = swap(number, begin, i);
            }
        }

    }

    public String swap(String number, int i, int j) {
        char[] charArray = number.toCharArray();
        char temp;
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
