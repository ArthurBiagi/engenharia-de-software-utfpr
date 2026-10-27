// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private int quantidadeDepartamentos;
    private Endereco endereco;
    private Contato contato;
    private List<Departamento> departamentos;

    //Sobrecarga
    public Loja() {
        this.nome = "";
        this.cnpj = "";
        this.quantidadeDepartamentos = 0;
        this.endereco = new Endereco();
        this.contato = new Contato();
        this.departamentos = new ArrayList<>();
    }

    //Sobrecarga
    public Loja(String nome, String cnpj, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.quantidadeDepartamentos = 0;
        this.endereco = endereco;
        this.contato = contato;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQuantidadeDepartamentos() {
        return quantidadeDepartamentos;
    }

    public void setQuantidadeDepartamentos(int quantidadeDepartamentos) {
        this.quantidadeDepartamentos = quantidadeDepartamentos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(Departamento dep) {
        this.departamentos.add(dep);
        this.quantidadeDepartamentos = this.departamentos.size();
    }

    public void listarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("Nenhum departamento cadastrado nesta loja.");
        } else {
            for (Departamento dep : departamentos) {
                if (dep instanceof Relatorio) {
                    System.out.println(((Relatorio) dep).gerarRelatorio());
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}
