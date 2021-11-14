package org.bridgelabz;
/*Author:Renu
Date:14/11/21
Purpose:Program for the test passrule4 validation
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean password(String password)
    {
        String regex="^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher("password");
        return matcher.matches();
    }
}
