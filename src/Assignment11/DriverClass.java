package Assignment11;

import java.io.IOException;
import java.util.HashMap;

public class DriverClass {
    public static void main(String[] args) throws IOException {
        String filepath = "/home/pragna.miryala/IdeaProjects/JavaClassroomAssignments/src/Assignment11/inputFile";
        CharacterFrequency characterFrequency = new CharacterFrequency();
        HashMap<Character, Integer> result = characterFrequency.findAllDifferentCharacters(filepath);
        characterFrequency.writeToFile(result,"/home/pragna.miryala/IdeaProjects/JavaClassroomAssignments/src/Assignment11/outputFile");
    }

}
