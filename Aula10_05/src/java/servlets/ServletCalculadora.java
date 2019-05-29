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
import negocio.Calculo;

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletCalculadora", urlPatterns = {"/Calculadora"})
public class ServletCalculadora extends HttpServlet {

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
            out.println("<title>Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora</h1>");
            
            out.println("<form action='' method='get' name='formCalculadora'>");
            out.println("Valor 1: <input type='text' name='valor1'><br>");
            out.println("Valor 2: <input type='text' name='valor2'><br><br>");
            out.println("<input type='submit' name='btnCalcular' value='+'>&nbsp;");
            out.println("<input type='submit' name='btnCalcular' value='-'>&nbsp;");
            out.println("<input type='submit' name='btnCalcular' value='x'>&nbsp;");
            out.println("<input type='submit' name='btnCalcular' value='/'>");
            out.println("</form>");
            
            if (request.getParameter("valor1") != null &&
                request.getParameter("valor1").length() > 0 &&
                request.getParameter("valor2") != null &&
                request.getParameter("valor2").length() > 0){
                // recupera os valores informados e os converte para float
                float v1 = Float.parseFloat(request.getParameter("valor1"));
                float v2 = Float.parseFloat(request.getParameter("valor2"));
                // instancia objeto da regra de negócio
                Calculo objCalc = new Calculo(v1, v2);
                // recupera a operação arimética desejada
                String operacao = request.getParameter("btnCalcular");
                // declara variável para receber o resultado da operação
                float resultado = 0;
                // executa a operação selecionada
                switch (operacao){
                    case "+": resultado = objCalc.somar(); break;
                    case "-": resultado = objCalc.subtrair(); break;
                    case "x": resultado = objCalc.multiplicar(); break;
                    case "/": resultado = objCalc.dividir(); break;
                }
                
                // exibe o resultado
                out.println(String.format("<br><b>Resultado: %.2f <b><br>", resultado));
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
