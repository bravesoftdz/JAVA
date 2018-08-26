/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Marciel
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private int idade;
    private String email;
    private int cid_codigo;

    public Pessoa(int codigo, String nome, int idade, String email, int cid_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cid_codigo = cid_codigo;
    }

    public int getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(int cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
