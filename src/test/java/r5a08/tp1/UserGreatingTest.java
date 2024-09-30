package r5a08.tp1;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserGreatingTest {
    @Test
    public void test() {
        UserGreating ug1 = new UserGreating();
        Assertions.assertThat(ug1.formatGreeting("nom")).
    }

    @Test
    public void testEmptyName() {
        UserGreating ug2 = new UserGreating();
        Assertions.assertThat(ug2.formatGreeting("")).isEmpty();

    }

    @Test
    public void testOtherthanString(){

    }
}
