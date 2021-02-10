package Assignment1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> matchedFiles = new ArrayList<String>();
        while (true) {
            System.out.println("Enter a pattern: ");
            String input = scanner.next(); // [0-9]*  [a-z]*
            if (input.equalsIgnoreCase("EXIT"))
                break;
            SearchDirectory searchDirectory = new SearchDirectory(input);
            File[] files = getHomeDirectoryFiles();
            matchedFiles = searchDirectory.searchFiles(files);
            printFilePaths(matchedFiles);
        }
    }

    private static File[] getHomeDirectoryFiles() {
        String location = System.getProperty("user.home");
        File[] files = new File(location).listFiles();
        return files;
    }

    private static void printFilePaths(List<String> matchedFiles) {
        for (String path : matchedFiles) {
            System.out.println(path);
        }
    }
}
