import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String result;
        if (username.equals("nguyendinhnguyen") && password.equals("Nguyen251096*"))
        {
            result = "Đăng nhập thành công";
        }
        else
        {
            result = "Đăng nhập thất bại";
        }
        req.getSession().setAttribute("result",result);
        resp.sendRedirect("http://localhost:8080/home");
    }
}