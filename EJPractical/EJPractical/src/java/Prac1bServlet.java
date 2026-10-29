import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Prac1bServlet"})
public class Prac1bServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =  response.getWriter();
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        if(uname.equals("Rupesh")&&upass.equals("rupesh")){
            out.println("<h3><b>Hello "+uname+"</b></h3>");
        }
        else{
            out.println("<h3><b>login failed!!</b></h3>");
        }
    }

}
