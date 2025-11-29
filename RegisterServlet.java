
import com.praosha.dao.UserDAO;
import com.praosha.model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");

        User u = new User();
        u.setUsername(username);
        u.setPassword(pwd);
        u.setFullname(fullname);
        u.setEmail(email);

        boolean created = userDAO.createUser(u);
        if (created) {
            resp.sendRedirect("login.jsp?msg=registered");
        } else {
            req.setAttribute("error","Registration failed");
            req.getRequestDispatcher("register.jsp").forward(req,resp);
        }
    }
}
