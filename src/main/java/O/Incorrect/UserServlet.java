package O.Incorrect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/* When a new Url is need to be called inside this servlet, we just need to add another constant from the UrlConstant
    If we do like this, every time there is a change to the path, we will need to find all of the
    servlet path and modify it, which is against the rule of Open - Close principle*/
@WebServlet(name = "UserServlet", urlPatterns = {"/user", "/user/action", "/random"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currentPageServletPath = req.getServletPath();
        switch (currentPageServletPath) {
            case "/user":
                // do something
                break;
            case "/user/action":
                // do something else
                break;
            case "/random":
                // do something else
                break;
            default:
                break;

        }
    }
}
