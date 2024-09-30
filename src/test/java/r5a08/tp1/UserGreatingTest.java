package r5a08.tp1;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserGreatingTest {

    @Test
    public void should_return_correct_greating_when_pauline() {
        // Arrange
        UserGreating userGreating = new UserGreating();
        String name = "Pauline";
        // Act
        String expected = "Bonjour, Pauline";
        String actual = userGreating.formatGreeting(name);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void should_return_correct_greating_when_correct_name_is_provided() {
        // Arrange
        UserGreating userGreating = new UserGreating();
        String name = "Paulette";

        // Act
        String expected = "Bonjour, Paulette";
        String actual = userGreating.formatGreeting(name);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void should_throw_exception_when__parameter_name_provided_is_empty() {
        // Arrange
        UserGreating ug = new UserGreating();
        String n = "";

        // Act , Assert
        assertThatExceptionOfType(UserGreatingFailureException.class)
                .isThrownBy(()->ug.formatGreeting(n));

    }


}
