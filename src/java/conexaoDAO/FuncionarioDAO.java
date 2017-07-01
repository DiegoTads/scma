/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelos.Computadores;
import modelos.Funcionario;
import modelos.Telefone;

/**
 *
 * @author Diego
 */
@Stateless
public class FuncionarioDAO 
{
    @PersistenceContext
    private EntityManager em;
    
    public void adicionar(Funcionario funcionario) 
    {
        em.persist(funcionario);
    }

    public ArrayList<Funcionario> listar() 
    {
        return (ArrayList<Funcionario>) em.createNamedQuery("Funcionario.BuscarFuncionarios").getResultList();
    }

    public void editar(Funcionario funcionario) 
    {
        em.merge(funcionario);
    }

    public void excluir(Funcionario funcionario) 
    {
        em.remove(buscar(funcionario));
    }

    public Funcionario buscar(Funcionario funcionario) 
    {
        return em.find(Funcionario.class, funcionario.getId());
    }
    
    public Funcionario buscarPorUsuario(String usuario, int senha)
    {
        Query query=em.createQuery("SELECT * FROM FUNCIONARIOS WHERE LOGIN=user AND SENHA=pass");
        query.setParameter("user", usuario);
        query.setParameter("pass", senha);
        List list=query.getResultList();
        return (Funcionario) list.get(0);
    }
    
    public Funcionario buscarRedefinirSenha(String usuario, String pergunta)
    {
        Query query=em.createQuery("SELECT * FROM FUNCIONARIOS WHERE LOGIN=user AND PERGUNTA=perg");
        query.setParameter("user", usuario);
        query.setParameter("perg", pergunta);
        List list=query.getResultList();
        return (Funcionario) list.get(0);
    }
    
    
/*    
    Connection connection;

    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Funcionario funcionario) {
        String sql = "INSERT INTO `funcionarios`(`nomeCompleto`, `login`, `senha`, `pergunta`, `resposta`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getLogin());
            stmt.setString(3, funcionario.getSenha());
            stmt.setString(4, funcionario.getPergunta());
            stmt.setString(5, funcionario.getResposta());

            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarPorId(Funcionario funcionario) {
        String sql = "UPDATE `funcionarios` SET `senha`=? WHERE id=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                       
            stmt.setString(1, funcionario.getSenha());
            stmt.setInt(2, funcionario.getId());
                       
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Funcionario buscarPorUsuario(String login, String pergunta) {
        String sql = "SELECT * FROM funcionarios WHERE login = ? AND pergunta = ?";
            
        Funcionario f = new Funcionario();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, pergunta);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            f.setId(rs.getInt("id"));
            f.setLogin(rs.getString("login"));
            f.setNome(rs.getString("nomeCompleto"));
            f.setSenha(rs.getString("senha"));
            f.setPergunta(rs.getString("pergunta"));
            f.setResposta(rs.getString("resposta"));

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    public Funcionario buscarPorUsuarioS(String login, String senha) {
        String sql = "SELECT * FROM funcionarios WHERE login = ? AND senha = ?";
            
        Funcionario f = new Funcionario();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            f.setLogin(rs.getString("login"));
            f.setSenha(rs.getString("senha"));

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }*/
}
