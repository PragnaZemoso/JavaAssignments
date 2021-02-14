package Assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KYCFormDateRange {

    public void findValidDateRange(String signUpDate, String givenCurrDate) { //04-04-2015 04-04-2016
        String signUpYear = signUpDate.substring(6);
        String givenCurrYear = givenCurrDate.substring(6);
        //System.out.println("-- Years " + signUpYear + " " + givenCurrYear); //-- Years 2015 2016

        final String dateFormat = "dd-MM-yyyy";
        LocalDate annualSignedLocalDate = LocalDate.parse(signUpDate.substring(0, 6) + givenCurrYear, DateTimeFormatter.ofPattern(dateFormat));
        LocalDate currLocalDate = LocalDate.parse(givenCurrDate, DateTimeFormatter.ofPattern(dateFormat));
        //System.out.println("annualSignedLocalDate & currLocalDate: " + annualSignedLocalDate + " " + currLocalDate); //annualSignedLocalDate & currLocalDate: 2016-04-04 2016-04-04

        LocalDate annualFutureLocalDate = annualSignedLocalDate.plusDays(30); //2016-05-04 --> yyyy-MM-dd
        String annualPastDate = annualSignedLocalDate.minusDays(30).format(DateTimeFormatter.ofPattern(dateFormat)); // 05-03-2016
        String annualFutureDate = annualSignedLocalDate.plusDays(30).format(DateTimeFormatter.ofPattern(dateFormat)); //04-05-2016
        //System.out.println("Past & future: " + annualPastDate + " " + annualFutureDate);

        if (signUpYear.equals(givenCurrYear))
            System.out.print("\n" + "No range");
        else {
            System.out.println();
            System.out.print(annualPastDate);
            if ((annualFutureLocalDate.compareTo(currLocalDate)) <= 0) // 2016-05-04.compareTo(2016-04-04)
                System.out.print(" " + annualFutureDate);
            else
                System.out.print(" " + givenCurrDate);
        }
    }
}
