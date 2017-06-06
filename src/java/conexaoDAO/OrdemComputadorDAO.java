package conexaoDAO;

import conexaoBD.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Computadores;
import modelos.Telefone;

/**
 *
 * @author gabriel
 */
public class OrdemComputadorDAO {

    Connection connection;

    public OrdemComputadorDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public int adicionar(Computadores computador) {
        String sql = "INSERT INTO `ordemcomputador`(`cliente`, `dataEntrada`, `dataCompra`, `garantia`, `marca`, `modelo`, `seriall`, `acessorios`, `defeito`, `estado`, `valor`, `situacao`, `abservacoes`, `atendente`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        OrdemComputadorDAO ocDAO = new OrdemComputadorDAO();
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, computador.getCliente());
            stmt.setString(2, computador.getDataEntrada());
            stmt.setString(3, computador.getDataCompra());
            stmt.setString(4, computador.getGarantia());
            stmt.setString(5, computador.getMarca());
            stmt.setString(6, computador.getModelo());
            stmt.setString(7, computador.getSeriall());
            stmt.setString(8, computador.getAcessorios());
            stmt.setString(9, computador.getDefeito());
            stmt.setString(10, computador.getEstado());
            stmt.setFloat(11, computador.getValor());
            stmt.setString(12, computador.getSituacao());
            stmt.setString(13, computador.getObservacoes());
            stmt.setString(14, computador.getAtendente());

            stmt.execute();
            stmt.close();

            return ocDAO.buscarPorSerial(computador.getSeriall());
            
        } catch (SQLException ex) {
            Logger.getLogger(OrdemComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public void removerPorProtocolo(Computadores computador) {
        String sql = "DELETE FROM ordemcomputador WHERE protocolo like ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, computador.getProtocolo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarPorProtocolo(Computadores computador) {
        String sql = "UPDATE `ordemcomputador` SET `cliente`=?,`dataEntrada`=?,`dataCompra`=?,`garantia`=?,`marca`=?,`modelo`=?,`acessorios`=?,`defeito`=?,`estado`=?,`valor`=?,`situacao`=?,`abservacoes`=?,`atendente`=? WHERE `protocolo`=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            
            stmt.setString(1, computador.getCliente());
            stmt.setString(2, computador.getDataEntrada());
            stmt.setString(3, computador.getDataCompra());
            stmt.setString(4, computador.getGarantia());
            stmt.setString(5, computador.getMarca());
            stmt.setString(6, computador.getModelo());
            stmt.setString(7, computador.getAcessorios());
            stmt.setString(8, computador.getDefeito());
            stmt.setString(9, computador.getEstado());
            stmt.setFloat(10, computador.getValor());
            stmt.setString(11, computador.getSituacao());
            stmt.setString(12, computador.getObservacoes());
            stmt.setString(13, computador.getAtendente());
            stmt.setInt(14, computador.getProtocolo());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Computadores> getLista() {
        String sql = "SELECT * FROM ordemcomputador";
        ArrayList<Computadores> listaComputadores = new ArrayList<Computadores>();
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Computadores computador = new Computadores();
                
                computador.setProtocolo(rs.getInt("protocolo"));
                computador.setCliente(rs.getString("cliente"));
                computador.setDataEntrada(rs.getString("dataEntrada"));
                computador.setDataCompra(rs.getString("dataCompra"));
                computador.setGarantia(rs.getString("garantia"));
                computador.setMarca(rs.getString("marca"));
                computador.setModelo(rs.getString("modelo"));
                computador.setSeriall(rs.getString("seriall"));
                computador.setAcessorios(rs.getString("acessorios"));
                computador.setDefeito(rs.getString("defeito"));
                computador.setEstado(rs.getString("estado"));
                computador.setValor(rs.getFloat("valor"));
                computador.setSituacao(rs.getString("situacao"));
                computador.setObservacoes(rs.getString("abservacoes"));
                computador.setAtendente(rs.getString("atendente"));
                listaComputadores.add(computador);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaComputadores;
    }

    public Computadores buscarPorProtocolo(int protocolo) {
        String sql = "SELECT * FROM ordemcomputador WHERE protocolo = ?";
        Computadores computador = new Computadores();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, protocolo);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            computador.setProtocolo(rs.getInt("protocolo"));
            computador.setCliente(rs.getString("cliente"));
            computador.setDataEntrada(rs.getString("dataEntrada"));
            computador.setDataCompra(rs.getString("dataCompra"));
            computador.setGarantia(rs.getString("garantia"));
            computador.setMarca(rs.getString("marca"));
            computador.setModelo(rs.getString("modelo"));
            computador.setSeriall(rs.getString("seriall"));
            computador.setAcessorios(rs.getString("acessorios"));
            computador.setDefeito(rs.getString("defeito"));
            computador.setEstado(rs.getString("estado"));
            computador.setValor(rs.getFloat("valor"));
            computador.setSituacao(rs.getString("situacao"));
            computador.setObservacoes(rs.getString("abservacoes"));
            computador.setAtendente(rs.getString("atendente"));

        } catch (SQLException ex) {
            Logger.getLogger(OrdemComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return computador;
    }
    
    public int buscarPorSerial(String serial) {
        String sql = "SELECT protocolo FROM ordemcomputador WHERE seriall = ?";
        
        int protocolo;
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, serial);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            protocolo=rs.getInt("protocolo");
            
            return protocolo;
        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public boolean jaExisteSerial(String serial) {
        String sql = "SELECT seriall FROM ordemcomputador WHERE seriall = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, serial);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            
            if(rs.getString("seriall").equals(serial))
            {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
