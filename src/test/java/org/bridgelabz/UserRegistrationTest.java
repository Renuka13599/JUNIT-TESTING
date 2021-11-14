package org.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNo(91 9789587787);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.mobileNo(919876546878);
        Assert.assertEquals(false, result);
    }
}
