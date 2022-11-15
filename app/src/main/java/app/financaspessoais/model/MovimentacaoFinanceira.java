package app.financaspessoais.model;

import java.util.Date;

enum TipoMovimentacao{
    DESPESA,
    RECEITA
}

public class MovimentacaoFinanceira {
    private Integer id;
    private Date dataRegistro;
    private Usuario usuario;
    private TipoMovimentacao tipo;
    private String titulo;
    private String descrição;
    private float valor;

    public MovimentacaoFinanceira(Usuario usuario, TipoMovimentacao tipo, String titulo, String descrição, float valor) {
        this.dataRegistro = new Date();
        this.usuario = usuario;
        this.tipo = tipo;
        this.titulo = titulo;
        this.descrição = descrição;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoMovimentacao getTipo(){
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo){
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}