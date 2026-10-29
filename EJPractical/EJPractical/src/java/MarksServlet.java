import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MarksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h2>Quizs Marks</h2><br>");
        int total = Integer.parseInt(request.getParameter("total"));
        int marks=0;
        String ans,sel;
        for(int i=1;i<=total;i++){
            ans = request.getParameter("ans"+i);
            sel = request.getParameter(String.valueOf(i));
            if(sel.equals(ans)){
                marks=marks+1;
                
            }
        }
        
        out.print("<h3>Total Marks: "+marks+"</h3>");
    }
}
