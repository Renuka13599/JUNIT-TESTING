package org.bridgelabz;
/*Author:Renu
Date:14/11/21
Purpose:Program for the test Email validation
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean email(String email)
    {
        String regex="^[A-Z]{1}[- @ .][a-z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher("email");
        return matcher.matches();
    }
}
