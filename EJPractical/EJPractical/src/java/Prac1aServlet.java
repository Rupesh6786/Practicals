

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Prac1aServlet", urlPatterns = {"/Prac1aServlet"})
public class Prac1aServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        String opr = request.getParameter("opr");
        switch(opr){
            case "+":
                out.print("Addition of "+n1+" + "+n2+" = "+(n1+n2));
                break;
            case "-":
                out.print("Subtraction of "+n1+" - "+n2+" = "+(n1-n2));
                break;
            case "*":
                out.print("Multiplication of "+n1+" X "+n2+" = "+(n1*n2));
                break;
            case "/":
                out.print("Division of "+n1+" / "+n2+" = "+(n1/n2));
                break;
            case "%":
                out.print("Modulus of "+n1+" % "+n2+" = "+(n1%n2));
                break;
            default:
                out.print("Error invaild input!!!");
                break;
        }
    }
}
