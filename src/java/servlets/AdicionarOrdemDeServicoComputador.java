/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import conexaoDAO.OrdemComputadorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Computadores;

/**
 *
 * @author Diego
 */
@WebServlet(name = "AdicionarOrdemDeServicoComputador", urlPatterns = {"/AdicionarOrdemDeServicoComputador"})
public class AdicionarOrdemDeServicoComputador extends HttpServlet {

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
            
            RequestDispatcher rd = null;
            Computadores computador = new Computadores();
            OrdemComputadorDAO ocDAO = new OrdemComputadorDAO();
            boolean verificacao=true;
            

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
   
                if(!request.getParameter("marca").equals(""))
                {
                    computador.setMarca(request.getParameter("marca"));
                } 
                else
                {
                    verificacao=false;
                }
                
                if(!request.getParameter("modelo").equals(""))
                {
                    computador.setModelo(request.getParameter("modelo"));
                } 
                else
                {
                    verificacao=false;
                }
                
            computador.setSeriall(computador.gerarSeriall());
                    
                if(!request.getParameter("data").equals(""))
                {
                    computador.setDataEntrada(request.getParameter("data"));
                } 
                else
                {
                    verificacao=false;
                }

                if(!request.getParameter("acessorios").equals(""))
                {
                    computador.setAcessorios(request.getParameter("acessorios"));
                } 
                else
                {
                    verificacao=false;
                }
            
            computador.setDefeito(request.getParameter("defeito"));
            computador.setEstado(request.getParameter("estadoAparelho"));
            computador.setValor(Float.parseFloat(String.valueOf(request.getParameter("valorServico"))));
            computador.setObservacoes(request.getParameter("observacao"));
            
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
                
                if(!request.getParameter("atendente").equals(""))
                {
                    computador.setAtendente(request.getParameter("atendente"));
                } 
                else
                {
                    verificacao=false;
                }
                
                if(verificacao==false)
                {
                    response.sendRedirect("erro.jsp");
                }
                else
                {
                    computador.setProtocolo(ocDAO.adicionar(computador));
            
                    rd=request.getRequestDispatcher("sucesso_adicionar_ordem_de_servico.jsp");

                    request.setAttribute("protocolo", computador.getProtocolo());

                    rd.forward(request, response);
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
