package r5a08_findmyword;

public class Score {
    private String correctWord;
    private Letter[] letters;  // Tableau pour stocker les résultats des lettres

    public Score(String correctWord) {
        this.correctWord = correctWord;
        this.letters = new Letter[correctWord.length()];  
    }

    // Évalue une lettre à un indice donné
    public void assess(int index, String attempt) {
        char letterGuess = attempt.charAt(index); 
        char letterCorrect = correctWord.charAt(index); 

        if (letterGuess == letterCorrect) {
            letters[index] = Letter.CORRECT;  
        } else {
            letters[index] = Letter.INCORRECT;  
        }
    }

    // Récupère le score de la lettre à un certain index
    public Letter letter(int index) {
        return letters[index];
    }
}