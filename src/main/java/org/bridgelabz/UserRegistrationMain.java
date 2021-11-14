package org.bridgelabz;
/*Author:Renu
Date:14/11/21
Purpose:Program for the emailtest cases validation
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean emailIdValidator(String password)
    {
        String regex="^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher("password");
        return matcher.matches();
    }

}
