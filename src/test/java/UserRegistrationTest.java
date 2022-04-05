import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.firstNameValidate.userEntries("Neha");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.firstNameValidate.userEntries("Neh");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.lastNameValidate.userEntries("Chougule");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.lastNameValidate.userEntries("Cho");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.phoneNumberValidate.userEntries("91 9863632323");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.phoneNumberValidate.userEntries("9123723");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordValidate.userEntries("Neha@8520");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordValidate.userEntries("Neh231#%");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }
}
