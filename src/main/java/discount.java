import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Discount", value = "/display-discount")
public class discount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("listPrice"));
        float discount = Float.parseFloat(req.getParameter("discountPercent"));
        float amount = (float) (price*discount*0.01);
        float newPrice = price - amount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Discount Amount: " + amount + " </h1>");
        writer.println("<h1> Discounted Price: " + newPrice + "</h1>");
        writer.println("</html>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
