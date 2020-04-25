package O.Correct;

public class UrlConstant {
    public final static String URL_USER = "/user";
    public final static String URL_USER_ACTION = "/user/action";
    /* open - close principle state that entities should be open for extension but not for modification
        - Class UrlConstant is open for extension when a new Url is created:
            - You just need to add another constant to this class and declared it once
    * */
}
