public class SecaoEsportes extends Departamento implements Relatorio {
    private int quantidadeBolas;
    private String categoriaModalidade;

    // Construtor Default
    public SecaoEsportes() {
    }

    public int getQuantidadeBolas() {
        return quantidadeBolas;
    }

    public void setQuantidadeBolas(int quantidadeBolas) {
        this.quantidadeBolas = quantidadeBolas;
    }

    public String getCategoriaModalidade() {
        return categoriaModalidade;
    }

    public void setCategoriaModalidade(String categoriaModalidade) {
        this.categoriaModalidade = categoriaModalidade;
    }

    // Sobrescrita
    public double calcularMeta() {
        return 5000.00 * 1.10;
    }

    // Sobrecarga
    public double calcularMeta(double fatorMultiplicador) {
        return 5000.00 * fatorMultiplicador;
    }

    // Sobrescrita
    public String gerarRelatorio() {
        return "Setor Esportes [ID: " + getId() + ", Nome: " + getNome() +
                ", Modalidade: " + categoriaModalidade + ", Bolas em Estoque: " + quantidadeBolas +
                ", Meta Calculada: R$ " + calcularMeta() + "]";
    }
}
