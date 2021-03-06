/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.aulaajax;

import br.estacio.webservice.CalculadoraWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Marcelo
 */
public class ServletAjax extends HttpServlet {

    

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
            out.println("<title>Servlet ServletAjax</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAjax at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);

        String retorno = "<?xml version='1.0'> <root>";
        /*o try-catch abaixo é utilizado somente para atrasar a resposta do servidor para uma melhor visualização da função do Ajax*/
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ServletAjax.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Obtendo o parametro (usuario) enviado pelo método .ajax*/
        String paramentroUsuario = request.getParameter("usuario");
        /*Verificação se o parametro não está vazio*/
        if (paramentroUsuario == "") {
            retorno += "<msg>"
                        + "<texto>Digite um usuário</texto>"
                    + "</msg>";
        } else {
            retorno += "<msg>"
                        + "<texto>Bem vindo" + request.getParameter("usuario") + "!</texto>"
                    + "</msg>";
        }
        /*configurando a resposta para aceitar acentuação*/
        response.setContentType("text/html; charset=UTF-8");
        /*escrevendo a resposta*/
        
        retorno += "</root>";
        
        response.getWriter().write(retorno);

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
    /*
    private int adicao(int i, int j){
        int result=0;
        try { // Call Web Service Operation
            br.estacio.webservice.CalculadoraWS port = service.getCalculadoraWSPort();
            // TODO initialize WS operation arguments here
            int num1 = 0;
            int num2 = 0;
            // TODO process result here
            result = port.adicao(num1, num2);
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return result;
    }*/
    
}
