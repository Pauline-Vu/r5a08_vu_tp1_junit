package r5a08.tp1;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserGreatingTest {

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
    public void should_throw_exception_when_parameter_name_provided_is_empty() {
        // Arrange
        UserGreating UserGreating = new UserGreating();
        String name = "";

        // Act , Assert
        assertThatExceptionOfType(UserGreatingFailureException.class)
                .isThrownBy(() -> UserGreating.formatGreeting(name));

    }

    @Test
    public void should_throw_exception_when_name_is_more_than_ten_characters() {
        // Arrange
        UserGreating UserGreating = new UserGreating();
        String name = "treslongprenom";

        // Act , Assert
        assertThatExceptionOfType(UserGreatingFailureException.class)
                .isThrownBy(() -> UserGreating.formatGreeting(name));

    }
}