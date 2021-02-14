package Assignment3;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter host: ");
        String host = scanner.next(); // 8.8.8.8
        System.out.println("Enter count of packets to send -c ");
        int count = scanner.nextInt(); //6

        PingAHost pingAHost = new PingAHost();
        pingAHost.execute(host, count);
    }
}
