import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

public class QuizApp extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<center><h2>Quiz Application</h2>");
        out.print("</center>");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals","root","root");
            PreparedStatement ps = con.prepareStatement("select * from questions");
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next()){
                out.print("<form action='MarksServlet' method='get'>");
                i++;
                out.print("<hr><b>Q."+rs.getInt(1));
                out.print(" "+rs.getNString(2)+"</b><br>");
                out.print("<input type='radio' name="+i+" value=1> "+rs.getNString(3));
                out.print("<br><input type='radio' name="+i+" value=2> "+rs.getNString(4));
                out.print("<br><input type='radio' name="+i+" value=3> "+rs.getNString(5));
                out.print("<br><input type='radio' name="+i+" value=4> "+rs.getNString(6));
                String ans = "ans"+i;
                out.print("<input type='hidden' name="+ans+" value="+rs.getInt(7)+">");
            }
            out.print("<input type='hidden' name='total' value="+i+">");
            out.print("<br><br><input type='submit' value='submit'>");
            out.print("</form>");
        }
        catch(Exception e){
            out.print("<b>Error: "+e+"</b>");
        }
        
    }
}
