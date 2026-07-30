public class WordUtils{
    public static boolean differsByOneLetter(String firstWord,String secondWord){
        if (firstWord.length() != secondWord.length()){
            return false;
        }
        boolean hasDifLetter = false;
        for (int i = 0; i<firstWord.length();i++){
            if(firstWord.charAt(i)!=secondWord.charAt(i)){
                if(hasDifLetter){
                    return false;
                }
                hasDifLetter = true;
            }
        }
        
        
        return hasDifLetter;
    }

}
