package org.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password(reuuka@123);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.password(ren45);
        Assert.assertEquals(false, result);
    }
}
