package Assignment4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfInputs = scanner.nextInt();
        String[] signUpDates = new String[noOfInputs];
        String[] currentDates = new String[noOfInputs];

        for (int i = 0; i < noOfInputs; i++) {
            signUpDates[i] = scanner.next();
            currentDates[i] = scanner.next();
        }

        for (int i = 0; i < noOfInputs; i++) {
            KYCFormDateRange kycFormDateRange = new KYCFormDateRange();
            kycFormDateRange.findValidDateRange(signUpDates[i], currentDates[i]);
        }
    }
}
