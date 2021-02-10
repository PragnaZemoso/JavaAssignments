package Assignment11;

import java.io.*;
import java.util.HashMap;

public class CharacterFrequency {
    private HashMap<Character, Integer> myCharacterFreqs;

    public CharacterFrequency() {
        myCharacterFreqs = new HashMap<>();
    }

    public HashMap<Character, Integer> findAllDifferentCharacters(String filePath) throws IOException {
        myCharacterFreqs.clear();
        File file = new File(filePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char currChar = line.charAt(i);
                if (myCharacterFreqs.isEmpty() || !myCharacterFreqs.containsKey(currChar)) {
                    myCharacterFreqs.put(currChar, 1);
                } else {
                    int currFreq = myCharacterFreqs.get(currChar);
                    myCharacterFreqs.put(currChar, currFreq + 1);
                }
            }
        }
        return myCharacterFreqs;
    }

    public void writeToFile(HashMap<Character, Integer> charFreqMap , String filepath) throws IOException {
        FileWriter fileWriter = new FileWriter(filepath);
        for (HashMap.Entry<Character, Integer> m : charFreqMap.entrySet()) {
            fileWriter.write("Character count of : " + m.getKey() + " --> " + m.getValue() + "\n");
        }
        fileWriter.write("Total Number of different Characters: " + charFreqMap.size());
        fileWriter.close();
    }
}
