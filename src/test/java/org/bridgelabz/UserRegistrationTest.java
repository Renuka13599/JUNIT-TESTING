package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Renuka");
        Assert.assertEquals(true,result);
    }echo "# JUNIT-TESTING" >> README.md

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("renuka");
        Assert.assertEquals(false, result);
    }
}
