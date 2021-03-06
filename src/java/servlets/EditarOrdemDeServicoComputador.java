/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import conexaoDAO.OrdemComputadorDAO;
import conexaoDAO.OrdemTelefoneDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Computadores;
import modelos.Telefone;

/**
 *
 * @author Diego
 */
@WebServlet(name = "EditarOrdemDeServicoComputador", urlPatterns = {"/EditarOrdemDeServicoComputador"})
public class EditarOrdemDeServicoComputador extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        try {
            RequestDispatcher rd = null;
            OrdemComputadorDAO ocDAO = new OrdemComputadorDAO();
            Computadores computador = new Computadores();
            Computadores comp = new Computadores();
            comp.setProtocolo(Integer.parseInt(String.valueOf(request.getParameter("protocolo"))));
            
            computador=ocDAO.buscar(comp);
            
            if(computador.getProtocolo()!=Integer.parseInt(String.valueOf(request.getParameter("protocolo"))))
            {
                response.sendRedirect("erro.jsp");
            }
            else
            {
                rd=request.getRequestDispatcher("sucesso_editar_ordem_de_servico_computador.jsp");

                request.setAttribute("computador", computador);

                rd.forward(request, response);
            }
        }
        catch(Exception e)
        {
            response.sendRedirect("erro.jsp");
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
