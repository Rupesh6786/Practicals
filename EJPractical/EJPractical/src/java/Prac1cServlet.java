import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/Prac1cServlet"})
public class Prac1cServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        String uemail = request.getParameter("uemail");
        String ucou = request.getParameter("ucou");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals", "root", "root");
            PreparedStatement ps = con.prepareStatement("insert into regtable values(?,?,?,?)");
            ps.setString(1, uname);
            ps.setString(2,upass);
            ps.setString(3, uemail);
            ps.setString(4, ucou);
            ps.executeUpdate();
            out.println("<h3>"+uname+" your registration data stored successfully!!</h3>");
            con.close();
        }catch(Exception e){
            out.println("<h3>Error: "+e+"</h3>");
        }
    }
}
