package org.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistration=new UserRegistrationMain();
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result =  UserRegistrationMain.analyseMood("I am in  Happy mood");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() {
        String result =  UserRegistrationMain.analyseMood("I am in Sad mood");
        Assert.assertEquals("Entry Failed", result);
    }

}
