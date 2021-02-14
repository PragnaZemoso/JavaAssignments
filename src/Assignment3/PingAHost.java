package Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PingAHost {
    private List<Double> pingTimes = new ArrayList<>();

    public void execute(String host, int count) throws IOException {
        executePingHostWithCount(host, count);
        printPingTimes(pingTimes);
        double median = findMedian(pingTimes);
        System.out.println("Median of the time taken to ping host " + host + " : " + median);
    }

    private void executePingHostWithCount(String host, int count) throws IOException {
        Process process = Runtime.getRuntime().exec("ping -c " + count + " " + host);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            getPingTimes(line);
        }
    }

    private void getPingTimes(String line) {
        int timeIndex = line.indexOf("time=");
        int msIndex = line.indexOf(" ms");
        if (timeIndex != -1 && msIndex != -1) {
            double pingTime = Double.parseDouble(line.substring(timeIndex + 5, msIndex));
            //System.out.println(pingTime);
            pingTimes.add(pingTime);
        }
    }

    private void printPingTimes(List<Double> timesList) {
        System.out.println("----- printing ping times ------");
        for (Double time : timesList)
            System.out.println(time);
    }

    private double findMedian(List<Double> listOfTimes) {
        Collections.sort(listOfTimes);
        int listSize = listOfTimes.size();
        double median;
        if (listSize % 2 == 0) {
            double middleTimes = listOfTimes.get((listSize - 1) / 2) + listOfTimes.get(listSize / 2);
            median = middleTimes / 2;
        } else
            median = listOfTimes.get(listSize / 2);
        return median;
    }
}
