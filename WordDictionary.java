import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class WordDictionary{
    private ArrayList<String> words = new ArrayList<String>();
    private HashSet<String> wordLookup = new HashSet<String>();
    public WordDictionary(String fileName) throws IOException{
        File myObj = new File(fileName);

        try(Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()) {
            String word = myReader.nextLine();
            words.add(word);
            wordLookup.add(word);
      }

            
        }catch (IOException e){
            throw e;
        }
    }
    public boolean contains(String word){
            return wordLookup.contains(word);
    }
    
    //Not very efficient but works for the size of the dictionary
    //if dictionary was bigger should use binary search 
    public ArrayList<String> getWordsOfLength(int len){
        ArrayList<String> wordList = new ArrayList<String>();
        int count = 0;
        while(count<words.size()){
            if(len == words.get(count).length()){
                wordList.add(words.get(count));
                try{
                    if(len != words.get(count+1).length()){
                        break;
                    }
                }
                catch(IndexOutOfBoundsException e){
                }
                
            }
            count++;
        }
        return wordList;
    }



}
