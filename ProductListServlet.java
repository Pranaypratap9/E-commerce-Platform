
import com.praosha.dao.ProductDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProductListServlet extends HttpServlet {
    private ProductDAO productDAO = new ProductDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", productDAO.listAll());
        req.getRequestDispatcher("products.jsp").forward(req, resp);
    }
}

