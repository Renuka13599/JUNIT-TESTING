package org.bridgelabz;
/*Author:Renu
Date:14/11/21
pupose:Program to test firstName
 */

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Renuka");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.lastName("renuka");
        Assert.assertEquals(false, result);
    }
}
