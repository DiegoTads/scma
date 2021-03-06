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
@WebServlet(name = "EditarOrdemDeServicoComputador1", urlPatterns = {"/EditarOrdemDeServicoComputador1"})
public class EditarOrdemDeServicoComputador1 extends HttpServlet {

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
        
        try (PrintWriter out = response.getWriter()) {
            OrdemComputadorDAO ocDAO = new OrdemComputadorDAO();
            Computadores computador = new Computadores();
            boolean verificacao=true;
            
            if(request.getParameter("excluir").equalsIgnoreCase("Sim"))
            {
                computador.setProtocolo(Integer.parseInt(String.valueOf(request.getParameter("protocolo"))));

                if(request.getParameter("cliente").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setCliente(request.getParameter("cliente"));
                }

                if(request.getParameter("data").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setDataEntrada(request.getParameter("data"));
                }

                computador.setDataCompra(request.getParameter("dataCompra"));

                try
                {
                    if(!request.getParameter("garantia").equals("") && request.getParameter("garantia")!=null)
                    {
                        computador.setGarantia(request.getParameter("garantia"));
                    } 
                    else
                    {
                        verificacao=false;
                    }
                }
                catch(Exception e)
                {
                    verificacao=false;
                }

                if(request.getParameter("marca").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setMarca(request.getParameter("marca"));
                }

                if(request.getParameter("modelo").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setModelo(request.getParameter("modelo"));
                }

                if(request.getParameter("serial").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setSeriall(request.getParameter("serial"));
                }

                computador.setAcessorios(request.getParameter("acessorios"));


                if(request.getParameter("defeito").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setDefeito(request.getParameter("defeito"));
                }

                computador.setEstado(request.getParameter("estadoAparelho"));
                computador.setValor(Float.parseFloat(String.valueOf(request.getParameter("valorServico"))));

                try
                {
                    if(!request.getParameter("situacao").equals("") && request.getParameter("situacao")!=null)
                    {
                        computador.setSituacao(request.getParameter("situacao"));
                    } 
                    else
                    {
                        verificacao=false;
                    }
                }
                catch(Exception e)
                {
                    verificacao=false;
                }

                if(request.getParameter("atendente").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    computador.setAtendente(request.getParameter("atendente"));
                }

                computador.setObservacoes(request.getParameter("observacao"));

                if(verificacao==false)
                {
                    response.sendRedirect("erro.jsp");
                }
                else
                {
                    ocDAO.editar(computador);
                    response.sendRedirect("crud_computadores.jsp");

                }          
            }
            else
            {
                response.sendRedirect("editar_ordem_de_servico_computador.jsp");
            }
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
