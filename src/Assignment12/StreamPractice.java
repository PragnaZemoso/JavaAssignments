package Assignment12;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        //forEach
        //limit() method is used to reduce the size of the stream
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //map - to map each element to its corresponding result.
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("list of unique squares : " + squaresList);

        //filter() method is used to eliminate elements based on a criteria.
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count = (int) strings.stream().filter(i -> i.isEmpty()).count();
        System.out.println("Count of empty strings: " + count);


        //sorted() method is used to sort the stream
        Random randomm = new Random();
        randomm.ints().limit(10).sorted().forEach(System.out::println);

        //parallelStream is the alternative of stream for parallel processing
        //It is very easy to switch between sequential and parallel streams
        List<String> stringsList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count1 = (int) strings.parallelStream().filter(i -> i.isEmpty()).count();
        System.out.println("Count of empty strings: " + count1);


        /**
         * Collectors are used to combine the result of processing on the elements of a stream. Collectors can be used to return a list or a string.
         */
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("*"));
        System.out.println("Merged String: " + mergedString);

        /**
         * With Java 8, Statistics collectors are introduced to calculate all statistics when stream processing is being done.
         */
        List numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }


}
