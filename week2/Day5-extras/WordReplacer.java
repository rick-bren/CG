package extras;

public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "I love programming in Java.";
        String oldWord = "Java";
        String newWord = "Python";
        
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println(modifiedSentence);
    }
    
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
