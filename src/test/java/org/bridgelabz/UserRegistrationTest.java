package org.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }
}
