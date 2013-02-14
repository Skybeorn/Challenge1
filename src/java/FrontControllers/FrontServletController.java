
package FrontControllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FrontServletController", urlPatterns = {"/FrontServletController"})
public class FrontServletController extends HttpServlet {

    private static final String HOME = "/OnePageInputOutputResults.jsp";
    private static final String RECTANGLE_CONTROLLER = "/RectangleInput";
    private static final String CIRCLE_CONTROLLER = "/CircleInput";
    private static final String HYOPOTENUSE_CONTROLLER = "/TriangleInput";
    private static final String INPUT_KEY = "action";
    private static final String INPUT_RECTANGLE = "RectangleInput";
    private static final String INPUT_CIRCLE = "CircleInput";
    private static final String INPUT_TRIANGLE = "TriangleInput";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        String destination = HOME;
        String key = request.getParameter(INPUT_KEY);

        if (key.equals(INPUT_RECTANGLE)) {
            destination = RECTANGLE_CONTROLLER;
        } else if (key.equals(INPUT_CIRCLE)) {
            destination = CIRCLE_CONTROLLER;
        } else if (key.equals(INPUT_TRIANGLE)) {
            destination = HYOPOTENUSE_CONTROLLER;
        } else {
            destination = HOME;
        }

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
