/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table
@NamedQueries
(
        @NamedQuery(name="Funcionario.BuscarFuncionarios", query="SELECT * FROM FUNCIONARIOS"))

public class Funcionario 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String pergunta;
    private String resposta;

    public Funcionario(String login, String senha, String pergunta, String resposta, String nome) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public Funcionario() {
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    } 
}
