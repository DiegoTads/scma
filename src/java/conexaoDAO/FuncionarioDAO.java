/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoDAO;

import conexaoBD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Computadores;
import modelos.Funcionario;

/**
 *
 * @author Diego
 */
public class FuncionarioDAO 
{
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
    }
}
