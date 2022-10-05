package br.cefetmg.inf.agenda.model.dto;

public class Rotulo {
    private int codigo;
    private String nome;


    public Rotulo(String nome) {
        this.codigo = 0;
        this.nome = nome;
    }    
    
    public Rotulo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
