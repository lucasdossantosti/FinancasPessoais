package app.financaspessoais.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private Integer id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String email;
    private String senha;
    private Date dataCadastro;
    private Date dataUltimoAcesso;
    private List<MovimentacaoFinanceira> movimentacoes;
    private float saldo;

    public Usuario(String nome, String sobrenome, Date dataNascimento, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = new Date();
        this.dataUltimoAcesso = new Date();
        this.movimentacoes = new ArrayList<>();
        this.saldo = 0;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public List<MovimentacaoFinanceira> getMovimentacoes(){
        return movimentacoes;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo) {this.saldo = saldo;}
}