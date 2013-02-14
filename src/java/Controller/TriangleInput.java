package Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.MissingHypotenuseCalculator;
import ModelInterfaces.ITriangleHypotenuse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TriangleInput", urlPatterns = {"/TriangleInput"})
public class TriangleInput extends HttpServlet {

    MissingHypotenuseCalculator calc = new MissingHypotenuseCalculator();
    private static final String RESULT_PAGE = "/Result.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String sideA = request.getParameter("sideA");
        String sideB = request.getParameter("sideB");
        String empty = "";
        calc.setTriangleSides(sideA, sideB, empty);
        double hypotenuse = calc.getHypotenuse();
        request.setAttribute("hypotenuse", hypotenuse);


        RequestDispatcher dispatch = request.getRequestDispatcher(RESULT_PAGE);
        dispatch.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
