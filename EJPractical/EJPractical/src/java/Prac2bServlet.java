import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

public class Prac2bServlet extends HttpServlet {

    int i;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String k = String.valueOf(i);
        Cookie c = new Cookie("visitno",k);
        response.addCookie(c);
        int j = Integer.parseInt(c.getValue());
        if(j==1){
            out.println("This is your first time you visit the page.");
        }
        else{
            out.println("You have visited thhis page "+i+" times.");
        }
        
        i++;
    }

}
