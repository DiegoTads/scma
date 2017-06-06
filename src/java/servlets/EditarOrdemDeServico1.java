/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import conexaoDAO.OrdemTelefoneDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Telefone;

/**
 *
 * @author Diego
 */
@WebServlet(name = "EditarOrdemDeServico1", urlPatterns = {"/EditarOrdemDeServico1"})
public class EditarOrdemDeServico1 extends HttpServlet {

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
            OrdemTelefoneDAO otDAO = new OrdemTelefoneDAO();
            Telefone telefone = new Telefone();
            boolean verificacao=true;
            
            if(request.getParameter("excluir").equalsIgnoreCase("Sim"))
            {
                telefone.setProtocolo(Integer.parseInt(String.valueOf(request.getParameter("protocolo"))));

                if(request.getParameter("cliente").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    telefone.setCliente(request.getParameter("cliente"));
                }

                telefone.setCaixa(request.getParameter("caixa"));

                if(request.getParameter("data").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    telefone.setDataEntrada(request.getParameter("data"));
                }

                telefone.setDataCompra(request.getParameter("dataCompra"));
                telefone.setOperadora(request.getParameter("operadora"));

                try
                {
                    if(!request.getParameter("garantia").equals("") && request.getParameter("garantia")!=null)
                    {
                        telefone.setGarantia(request.getParameter("garantia"));
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
                    telefone.setMarca(request.getParameter("marca"));
                }

                if(request.getParameter("modelo").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    telefone.setModelo(request.getParameter("modelo"));
                }

                if(request.getParameter("serial").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    telefone.setSeriall(request.getParameter("serial"));
                }

                telefone.setAcessorios(request.getParameter("acessorios"));


                if(request.getParameter("defeito").equals(""))
                {
                    verificacao=false;
                }
                else
                {
                    telefone.setDefeito(request.getParameter("defeito"));
                }

                telefone.setEstado(request.getParameter("estadoAparelho"));
                telefone.setValor(Float.parseFloat(String.valueOf(request.getParameter("valorServico"))));

                try
                {
                    if(!request.getParameter("situacao").equals("") && request.getParameter("situacao")!=null)
                    {
                        telefone.setSituacao(request.getParameter("situacao"));
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
                    telefone.setAtendente(request.getParameter("atendente"));
                }

                telefone.setObservacoes(request.getParameter("observacao"));

                if(verificacao==false)
                {
                    response.sendRedirect("erro.jsp");
                }
                else
                {
                    otDAO.alterarPorProtocolo(telefone);
                    response.sendRedirect("crud_telefones.jsp");

                }          
            }
            else
            {
                response.sendRedirect("editar_ordem_de_servico.jsp");
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
