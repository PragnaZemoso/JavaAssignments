package Assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class SearchDirectory {
    String pattern;
    List<String> matchedFiles = new ArrayList<String>();

    public SearchDirectory(String pattern) {
        this.pattern = pattern;
    }

    public List<String> searchFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory())
                searchFiles(file.listFiles());
            else if (Pattern.matches(pattern, file.getName()))
                matchedFiles.add(file.getAbsolutePath());
        }
        return matchedFiles;
    }
}