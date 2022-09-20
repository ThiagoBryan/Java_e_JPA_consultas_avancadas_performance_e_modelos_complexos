package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table( name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded// para dizer que os atributos da classe DadosPessoais são de Cliente
    private DadosPessoais dadosPessoais;

    public Cliente(String nome, String cpf) {
        this.dadosPessoais = new DadosPessoais(nome, cpf);
    }
    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public String getNome(){ // Método Delegade
        return this.dadosPessoais.getNome();
    }
    public String getCpf(){ // Método Delegade
        return this.dadosPessoais.getCpf();
    }

    public Cliente(){

    }
}
