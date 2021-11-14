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
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("renuka123@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.email("renuka&tammisetti@gmail.com");
        Assert.assertEquals(false, result);
    }
}
