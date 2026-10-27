// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public abstract class Departamento {
    private int id;
    private String nome;

    //Sobrecarga
    public Departamento() {
        this.id = 0;
        this.nome = "";
    }

    //Sobrecarga
    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
