package org.bridgelabz;
/*Author:Renu
Date:14/11/21
Purpose:Program for the happy and sad testcases validation
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public static String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else
            return null;
    }


}
