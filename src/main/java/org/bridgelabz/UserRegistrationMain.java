package org.bridgelabz;
/*Author:Renu
Date:14/11/21
Purpose:Program for the test mobileNo validation
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean mobileNo(String MobileNo)
    {
        String regex="^[0-9]{2}[0-9]{10,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher("mobileNo");
        return matcher.matches();
    }
}
