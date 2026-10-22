public class SecaoArtigosCasa extends Departamento implements Relatorio {
    private boolean possuiGarantiaEstendida;
    private String tipoMaterial;

    // Construtor Default
    public SecaoArtigosCasa() {
    }

    public boolean isPossuiGarantiaEstendida() {
        return possuiGarantiaEstendida;
    }

    public void setPossuiGarantiaEstendida(boolean possuiGarantiaEstendida) {
        this.possuiGarantiaEstendida = possuiGarantiaEstendida;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    //Sobrescrita
    public double calcularMeta() {
        return 8000.00 * 1.05;
    }

    //Sobrecarga
    public double calcularMeta(double fatorMultiplicador) {
        return 8000.00 * fatorMultiplicador;
    }

    //Sobrescrita
    public String gerarRelatorio() {
        return "Setor Artigos Casa [ID: " + getId() + ", Nome: " + getNome() + 
               ", Material: " + tipoMaterial + ", Garantia Estendida: " + (possuiGarantiaEstendida ? "Sim" : "Não") + 
               ", Meta Calculada: R$ " + calcularMeta() + "]";
    }
}
