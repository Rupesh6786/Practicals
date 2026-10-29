import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.*;
import java.util.concurrent.Future;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");

            Path path = Paths.get(getServletContext().getRealPath("/WEB-INF/book.txt"));

            AsynchronousFileChannel asyncFileChannel = AsynchronousFileChannel.open(
                    path, StandardOpenOption.READ);

            ByteBuffer buffer = ByteBuffer.allocate(2048);
            Future<Integer> result = asyncFileChannel.read(buffer, 0);

            result.get();

            buffer.flip();
            StringBuilder fileContent = new StringBuilder();
            while (buffer.hasRemaining()) {
                fileContent.append((char) buffer.get());
            }

            asyncFileChannel.close();

            String[] sentences = fileContent.toString().split("\\.\\s*");

            out.print("<center><h2>Demonstration Non-Blocking Read Operation</h2>");
            for (String sentence : sentences) {
                out.println("<span style='background:lightgray; color:black; width:100%;'>" + sentence + ".<br><br>");
                out.flush();
                Thread.sleep(1000);
            }
            out.print("</center>");

        } catch (Exception e) {
            out.println("<p>Error: " + e + "</p>");
        }
    }
}
