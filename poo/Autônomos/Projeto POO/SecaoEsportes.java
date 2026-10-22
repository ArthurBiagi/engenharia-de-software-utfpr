public class SecaoEsportes extends Departamento implements Relatorio {
    private int quantidadeBolas;
    private String categoriaModalidade;

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

    //Sobrescrita
    public double calcularMeta() {
        return 5000.00 * 1.10;
    }

    //Sobrecarga
    public double calcularMeta(double fatorMultiplicador) {
        return 5000.00 * fatorMultiplicador;
    }

    //Sobrescrita
    public double calcularICMS(double valorVendas) {
        return valorVendas * 0.12; // 12% ICMS
    }

    //Sobrescrita
    public String gerarRelatorio() {
        double meta = calcularMeta();
        double icms = calcularICMS(meta);
        return "Setor Esportes [ID: " + getId() + ", Nome: " + getNome() + 
               ", Modalidade: " + categoriaModalidade + ", Bolas: " + quantidadeBolas + 
               ", Meta: R$ " + meta + ", ICMS Estimado (12%): R$ " + icms + "]";
    }
}
