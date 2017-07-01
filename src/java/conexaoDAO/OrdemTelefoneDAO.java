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
import modelos.Funcionario;
import modelos.Telefone;

/**
 *
 * @author gabriel
 */
@Stateless
public class OrdemTelefoneDAO
{
    @PersistenceContext
    private EntityManager em;

    public int adicionar(Telefone telefone) 
    {
        em.persist(telefone);
        Query query=em.createQuery("SELECT * FROM TELEFONES WHERE SERIALL=ser");
        query.setParameter("ser", telefone.getSeriall());
        List list=query.getResultList();
        telefone=(Telefone) list.get(0);
        return telefone.getProtocolo();
    }

    public ArrayList<Telefone> listar() 
    {
        return (ArrayList<Telefone>) em.createNamedQuery("Telefones.BuscarTelefones").getResultList();
    }

    public void editar(Telefone telefone) 
    {
        em.merge(telefone);
    }

    public void excluir(Telefone telefone) 
    {
        em.remove(buscar(telefone));
    }

    public Telefone buscar(Telefone telefone) 
    {
        return em.find(Telefone.class, telefone.getProtocolo());
    }

    /*
    Connection connection;

    public OrdemTelefoneDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public int adicionar(Telefone telefone) {
        String sql = "INSERT INTO `ordemtelefone`(`cliente`, `caixa`, `dataEntrada`, `dataCompra`, `operadora`, `garantia`, `marca`, `modelo`, `seriall`, `acessorios`, `defeito`, `estado`, `valor`, `situacao`, `obsercacoes`, `atendente`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        int protocolo;
        OrdemTelefoneDAO otDAO = new OrdemTelefoneDAO();
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, telefone.getCliente());
            stmt.setString(2, telefone.getCaixa());
            stmt.setString(3, telefone.getDataEntrada());
            stmt.setString(4, telefone.getDataCompra());
            stmt.setString(5, telefone.getOperadora());
            stmt.setString(6, telefone.getGarantia());
            stmt.setString(7, telefone.getMarca());
            stmt.setString(8, telefone.getModelo());
            stmt.setString(9, telefone.getSeriall());
            stmt.setString(10, telefone.getAcessorios());
            stmt.setString(11, telefone.getDefeito());
            stmt.setString(12, telefone.getEstado());
            stmt.setFloat(13, telefone.getValor());
            stmt.setString(14, telefone.getSituacao());
            stmt.setString(15, telefone.getObservacoes());
            stmt.setString(16, telefone.getAtendente());

            stmt.execute();
            stmt.close();

            return protocolo=otDAO.buscarPorSerial(telefone.getSeriall());
            
        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public void removerPorProtocolo(Telefone telefone) {
        String sql = "DELETE FROM ordemtelefone WHERE protocolo like ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, telefone.getProtocolo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarPorProtocolo(Telefone telefone) {
        String sql = "UPDATE `ordemtelefone` SET `cliente`=?,`caixa`=?,`dataEntrada`=?,`dataCompra`=?,`operadora`=?,`garantia`=?,`marca`=?,`modelo`=?,`seriall`=?,`acessorios`=?,`defeito`=?,`estado`=?,`valor`=?,`situacao`=?,`obsercacoes`=?,`atendente`=? WHERE `protocolo`=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, telefone.getCliente());
            stmt.setString(2, telefone.getCaixa());
            stmt.setString(3, telefone.getDataEntrada());
            stmt.setString(4, telefone.getDataCompra());
            stmt.setString(5, telefone.getOperadora());
            stmt.setString(6, telefone.getGarantia());
            stmt.setString(7, telefone.getMarca());
            stmt.setString(8, telefone.getModelo());
            stmt.setString(9, telefone.getSeriall());
            stmt.setString(10, telefone.getAcessorios());
            stmt.setString(11, telefone.getDefeito());
            stmt.setString(12, telefone.getEstado());
            stmt.setFloat(13, telefone.getValor());
            stmt.setString(14, telefone.getSituacao());
            stmt.setString(15, telefone.getObservacoes());
            stmt.setString(16, telefone.getAtendente());
            stmt.setInt(17, telefone.getProtocolo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Telefone> getLista() {
        String sql = "SELECT * FROM ordemtelefone";
        ArrayList<Telefone> listaTelefone = new ArrayList<Telefone>();
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Telefone telefones = new Telefone();
                telefones.setProtocolo(rs.getInt("protocolo"));
                telefones.setCliente(rs.getString("cliente"));
                telefones.setCaixa(rs.getString("caixa"));
                telefones.setDataEntrada(rs.getString("dataEntrada"));
                telefones.setDataCompra(rs.getString("dataCompra"));
                telefones.setOperadora(rs.getString("operadora"));
                telefones.setGarantia(rs.getString("garantia"));
                telefones.setMarca(rs.getString("marca"));
                telefones.setModelo(rs.getString("modelo"));
                telefones.setSeriall(rs.getString("seriall"));
                telefones.setAcessorios(rs.getString("acessorios"));
                telefones.setDefeito(rs.getString("defeito"));
                telefones.setEstado(rs.getString("estado"));
                telefones.setValor(rs.getFloat("valor"));
                telefones.setSituacao(rs.getString("situacao"));
                telefones.setObservacoes(rs.getString("obsercacoes"));
                telefones.setAtendente(rs.getString("atendente"));
                listaTelefone.add(telefones);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTelefone;
    }

    public Telefone buscarPorProtocolo(int protocolo) {
        String sql = "SELECT * FROM ordemtelefone WHERE protocolo like ?";
        Telefone telefones = new Telefone();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, protocolo);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            telefones.setProtocolo(rs.getInt("protocolo"));
            telefones.setCliente(rs.getString("cliente"));
            telefones.setCaixa(rs.getString("caixa"));
            telefones.setDataEntrada(rs.getString("dataEntrada"));
            telefones.setDataCompra(rs.getString("dataCompra"));
            telefones.setOperadora(rs.getString("operadora"));
            telefones.setGarantia(rs.getString("garantia"));
            telefones.setMarca(rs.getString("marca"));
            telefones.setModelo(rs.getString("modelo"));
            telefones.setSeriall(rs.getString("seriall"));
            telefones.setAcessorios(rs.getString("acessorios"));
            telefones.setDefeito(rs.getString("defeito"));
            telefones.setEstado(rs.getString("estado"));
            telefones.setValor(rs.getFloat("valor"));
            telefones.setSituacao(rs.getString("situacao"));
            telefones.setObservacoes(rs.getString("obsercacoes"));
            telefones.setAtendente(rs.getString("atendente"));

        } catch (SQLException ex) {
            Logger.getLogger(OrdemTelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telefones;
    }
    
    public int buscarPorSerial(String serial) {
        String sql = "SELECT protocolo FROM ordemtelefone WHERE seriall = ?";
        
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
    }*/

}
