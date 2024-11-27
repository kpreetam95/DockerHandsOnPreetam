//Acts as a global properties file
//Certain properties going to be constant
//reusable values during execution using maven
package base;

public class AppConstants
{
    public static final String browserName = System.getProperty("browserName", "chrome");
    public static final String platform = System.getProperty("platform", "local");
    //public static final String platform = System.getProperty("platform", "remote_git");

}
