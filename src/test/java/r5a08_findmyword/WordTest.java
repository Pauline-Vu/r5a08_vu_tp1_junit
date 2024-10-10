package r5a08_findmyword;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("B"); // tentative du joueur

        // Assert
        assertEquals(Letter.INCORRECT, score.letter(0)); // On attend une lettre incorrecte
    }

    @Test
    public void should_check_one_correct_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à deviner est "E"

        // Act
        Score score = word.guess("E"); // tentative du joueur

        // Assert
        assertEquals(Letter.CORRECT, score.letter(0)); // On attend une lettre correcte
    }
}

