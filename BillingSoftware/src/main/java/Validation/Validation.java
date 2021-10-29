
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hp
 */
public class Validation {
    private Pattern name;
    private Pattern emailId;
    private Pattern phone;
    private Pattern password;
    
    private Matcher matcher;
    
    private static final String NAME_PATTERN = "^[A-Za-z ]{3,25}$";
    private static final String EMAILID_PATTERN = "^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,3}$)";
    private static final String PHONE_PATTERN = "^[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[A-Za-z0-9]{3,25}$";
    
    public Validation()
    {
        name = Pattern.compile(NAME_PATTERN);
        emailId = Pattern.compile(EMAILID_PATTERN);
        phone = Pattern.compile(PHONE_PATTERN);
        password = Pattern.compile(PASSWORD_PATTERN);
    }
    
    public boolean nameValidation(final String name1)
    {
        matcher = name.matcher(name1);
        return matcher.matches();
    } 
    
    public boolean emailIdValidation(final String emailId1)
    {
        matcher = emailId.matcher(emailId1);
        return matcher.matches();
    }
    
    public boolean phoneValidation(final String phone1)
    {
        matcher = phone.matcher(phone1);
        return matcher.matches();
    }
    
    public boolean passwordValidation(final String pass)
    {
        matcher = password.matcher(pass);
        return matcher.matches();
    }
}
