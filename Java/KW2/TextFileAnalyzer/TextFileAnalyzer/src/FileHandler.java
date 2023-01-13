import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    String line;
    ArrayList<String> filler = new ArrayList<>();
    ArrayList<String> words = new ArrayList<>();

    public void File() throws IOException {
        int count = 0, maxCount = 0;


        FileReader fr = new FileReader("C:\\Github\\BLJ2022RuSch\\Java\\KW2\\TextFileAnalyzer\\script.txt");
        BufferedReader br = new BufferedReader(fr);



        while ((line = br.readLine()) != null) {

            line = line.replaceAll("[^a-zA-Z' ]", "");
            String[] array = line.split("\\s+");
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].toLowerCase();
            }

            for (String word : array) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }
        for(int i = 0; i < words.size(); i++){
            count = 1;

            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                line = words.get(i);
            }
        }


        br.close();

                ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (!arr.contains(words.get(i))){
                arr.add(words.get(i));
            }

        }
        filler = arr;
            }

}

