import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "pageServlet",urlPatterns = "/a")
public class pageServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("ee");
        if (action.equals("a")){
            request.getRequestDispatcher("a.jsp").forward(request,response);
        }else if (action.equals("b")){
            request.getRequestDispatcher("b.jsp").forward(request,response);
        }else if (action.equals("c")){
            request.getRequestDispatcher("c.jsp").forward(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("a.jsp").forward(request,response);
    }
}
