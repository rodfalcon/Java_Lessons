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

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletCadastroUsuario", urlPatterns = {"/CadastroUsuario"})
public class ServletCadastroUsuario extends HttpServlet {

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
            out.println("<title>Servlet para Cadastro de Usuário</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet para Cadastro de Usuário</h1>");
            
            out.println("<form action='' method=''>");
            out.println("Nome: <input type='text' name='txtNome' " +
                                    "placeholder='Informe seu nome'><br>");
            out.println("E-mail: <input type='text' name='txtEmail' " + 
                                    "placeholder='Informe seu e-mail'><br><br>");
            out.println("<input type='submit' value='Cadastrar usuário'>");
            out.println("</form><br><br>");
            
            if (request.getParameter("txtNome") != null &&
                request.getParameter("txtNome").length() > 0 &&
                request.getParameter("txtEmail") != null &&
                request.getParameter("txtEmail").length() > 0){

                String nome = request.getParameter("txtNome");
                String email = request.getParameter("txtEmail");

                out.println(String.format("Olá, %s, seja bem-vindo! " + 
                        "Seu login é %s", nome, email));
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
