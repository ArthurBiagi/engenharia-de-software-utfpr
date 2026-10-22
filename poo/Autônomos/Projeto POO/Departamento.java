public abstract class Departamento {
    private int id;
    private String nome;

    public Departamento() {
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

    public abstract double calcularMeta();

    // Método abstrato para o cálculo de imposto
    public abstract double calcularICMS(double valorVendas);
}
