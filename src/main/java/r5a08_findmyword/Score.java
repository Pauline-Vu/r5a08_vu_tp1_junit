package r5a08_findmyword;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private  String correctWord;
    private Letter result = Letter.INCORRECT;

    public Score(String guessWord) {
        this.correctWord=guessWord;
    }

    public Letter letter(int i) {
        return result;
    }

    public void assess(int index, String attempt) {
        if (this.correctWord.charAt(index)==attempt.charAt(index)){
            result = Letter.CORRECT;
        }
        else {
        	result = Letter.INCORRECT;
        }
    }
}