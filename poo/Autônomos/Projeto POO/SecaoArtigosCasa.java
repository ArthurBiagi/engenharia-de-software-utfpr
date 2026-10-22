public class SecaoArtigosCasa extends Departamento implements Relatorio {
    private boolean possuiGarantiaEstendida;
    private String tipoMaterial;

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
    public double calcularICMS(double valorVendas) {
        return valorVendas * 0.07; // 7% ICMS
    }

    //Sobrescrita
    public String gerarRelatorio() {
        double meta = calcularMeta();
        double icms = calcularICMS(meta);
        return "Setor Artigos Casa [ID: " + getId() + ", Nome: " + getNome() + 
               ", Material: " + tipoMaterial + ", Garantia Estendida: " + (possuiGarantiaEstendida ? "Sim" : "Não") + 
               ", Meta: R$ " + meta + ", ICMS Estimado (7%): R$ " + icms + "]";
    }
}
