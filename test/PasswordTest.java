import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class PasswordTest {

        @Test
        public void Password1() {
            Password userPassword = mock(Password.class);
            Password name = userPassword.password(true, true, true, false);
            Assert.assertEquals(name, "Hello");
        }

        @Test
        public void Password2() {
            Password userPassword = mock(Password.class);
            Password name = userPassword.password(true, true, true, true);
            Assert.assertEquals(name, "Student#1");
        }

        @Test
        public void FalsePassword() {
            Password userPassword = mock(Password.class);
            Password name = userPassword.password(false, false, false, false);
            Assert.assertNotEquals(name, "CBULancers50");
        }

        @Test
        public void InvalidPasswordCharacter1() {
            Password userPassword = mock(Password.class);
            Password name = userPassword.password(false, true, true, false);
            Assert.assertEquals(name, "%Hi");
        }

        @Test
        public void InvalidPasswordCharacter2() {
            Password userPassword = mock(Password.class);
            Password name = userPassword.password(false, true, true, false);
            Assert.assertEquals(name, "@StudentGit");
        }
    }