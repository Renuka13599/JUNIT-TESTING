package org.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password(reNuka);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.password(ren13);
        Assert.assertEquals(false, result);
    }
}
