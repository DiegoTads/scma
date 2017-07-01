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
        @NamedQuery(name="Telefones.BuscarTelefones", query="SELECT * FROM TELEFONES"))

public class Telefone
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int protocolo;
    private String caixa;
    private String operadora;
    private String dataEntrada;
    private String dataCompra;
    private String cliente;
    private String garantia;
    private String marca;
    private String modelo;
    private String seriall;
    private String acessorios;
    private String defeito;
    private String estado;
    private float valor;
    private String situacao;
    private String observacoes;
    private String atendente;

    public Telefone(int protocolo, String cliente, String caixa, String dataEntrada, String dataCompra, String operadora, String garantia, String marca, String modelo, String seriall, String acessorios, String defeito, String estado, float valor, String situacao, String observacoes, String atendente) {
        this.protocolo = protocolo;
        this.cliente = cliente;
        this.caixa = caixa;
        this.dataEntrada = dataEntrada;
        this.dataCompra = dataCompra;
        this.operadora = operadora;
        this.garantia = garantia;
        this.marca = marca;
        this.modelo = modelo;
        this.seriall = seriall;
        this.acessorios = acessorios;
        this.defeito = defeito;
        this.estado = estado;
        this.valor = valor;
        this.situacao = situacao;
        this.observacoes = observacoes;
        this.atendente = atendente;
    }

    public Telefone() {
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSeriall() {
        return seriall;
    }

    public void setSeriall(String seriall) {
        this.seriall = seriall;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }
    
    
}
