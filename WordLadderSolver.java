import java.util.ArrayList;
import java.util.HashSet;
public class WordLadderSolver{
    private WordDictionary dictionary;
    private HashSet<String> visited = new HashSet<String>();
    private ArrayList<String> ladder = new ArrayList<String>();
    public WordLadderSolver(
        WordDictionary dictionary){
            this.dictionary = dictionary;
        }
    public ArrayList<String> findLadder(
        String startWord,
        String endWord)
        {
            visited.clear();
            ladder.clear();
            
            if (!search(startWord, endWord)) {
                ladder.clear();
            }

            return ladder;
        }
    private boolean search(
        String currentWord,
        String endWord)
        {
            //add to ladder
            ladder.add(currentWord);
            //add to visited
            visited.add(currentWord);
            //check if endWord
            if(currentWord.equals(endWord)){
                return true;
            }
            //Identify words that differ by exactly one letter
            ArrayList<String> currentCandidates = new ArrayList<String>();
            ArrayList<String> sameLetter = dictionary.getWordsOfLength(currentWord.length());
            for (int i = 0; i<sameLetter.size();i++){
                if(WordUtils.differsByOneLetter(currentWord,sameLetter.get(i))){
                    currentCandidates.add(sameLetter.get(i));
                }
            }
            //recursive search
            for (int i = 0; i<currentCandidates.size();i++){
                if(!visited.contains(currentCandidates.get(i))){
                    if(search(currentCandidates.get(i),endWord)){
                        return true;
                    }
                }
            }
            //backtracking
            ladder.remove(ladder.size() - 1);
            visited.remove(currentWord);

            return false;
        }

}
