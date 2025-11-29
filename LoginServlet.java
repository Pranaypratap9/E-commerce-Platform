
import com.praosha.dao.UserDAO;
import com.praosha.model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User u = userDAO.findByUsername(username);
        if (u != null && u.getPassword().equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", u);
            resp.sendRedirect("products");
        } else {
            req.setAttribute("error","Invalid cred");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}

