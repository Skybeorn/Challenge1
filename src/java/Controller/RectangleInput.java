package Controller;

import Model.RectangularArea;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RectangleInput", urlPatterns = {"/RectangleInput"})
public class RectangleInput extends HttpServlet {

    private static final String RESULT_PAGE = "/Result.jsp";
    RectangularArea calc = new RectangularArea();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        String length = request.getParameter("length");
        String width = request.getParameter("width");
        calc.setRectangleSides(length, width);
        double area = calc.getArea();
        request.setAttribute("rectangleArea", area);
         
        RequestDispatcher dispatch = request.getRequestDispatcher(RESULT_PAGE);
        dispatch.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
