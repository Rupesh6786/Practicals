
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Prac2cServlet extends HttpServlet {

    int i;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");
        HttpSession session = request.getSession();
        if(name.equals("Rupesh")&&pass.equals("rupesh")&&session.isNew()){
            out.println("Hello "+name+" This is first time you visit this page.");
            out.println("<a href='signout'>signout</a>");
        }
        else{
            out.println("Hello "+name+" You visited this page "+i+"times");
            out.println("<a href='signout'>signout</a>");
        }
        i++;
    }

}
