/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Massa;

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletConversaoDeMassa", urlPatterns = {"/ConversaoDeMassa"})
public class ServletConversaoDeMassa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para conversão de massas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet para conversão de massas</h1>");
            
            if (request.getParameter("massa") != null &&
                request.getParameter("massa").length() > 0){
                
                // recupera a massa original a ser convertida 
                float massaOriginal = Float.parseFloat(request.getParameter("massa"));
                float massaConvertida = 0;
                // recupera a conversão a ser realizada
                String conversaoSolicitada = request.getParameter("btnConverter");
                String msg = "";
                if (conversaoSolicitada.equals("kg para lb")){
                    massaConvertida = new Massa().converterQuiloParaLibra(massaOriginal);
                    msg = String.format("<br>Massa original: %.2f kg; massa " + 
                            "convertida: %.2f lbs.", massaOriginal, massaConvertida);
                }
                else {
                    massaConvertida = new Massa().converterLibraParaQuilo(massaOriginal);
                    msg = String.format("<br>Massa original: %.2f lbs; massa " + 
                            "convertida: %.2f kg.", massaOriginal, massaConvertida);
                }
                out.println(msg);
                
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
