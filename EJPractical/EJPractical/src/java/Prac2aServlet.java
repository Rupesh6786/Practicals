import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
/*
author : Prem vishwakarma
*/

@WebServlet(urlPatterns = {"/Prac2aServlet"})
public class Prac2aServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        if(upass.equals("Servlet")){
            request.setAttribute("user", uname);
            RequestDispatcher rd = request.getRequestDispatcher("/welcomeServlet");
            rd.forward(request, response);
        }
        else{
            out.println("Invaild Candientials!!");
            RequestDispatcher rd1 = request.getRequestDispatcher("/Prac2a.html");
            rd1.include(request, response);
        }
    }
}
