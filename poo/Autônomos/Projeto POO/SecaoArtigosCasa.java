public class SecaoArtigosCasa extends Departamento implements Relatorio {
    private boolean possuiGarantiaEstendida;
    private String tipoMaterial;

    public SecaoArtigosCasa() {
    }

    public SecaoArtigosCasa(int id, String nome, boolean possuiGarantiaEstendida, String tipoMaterial) {
        super(id, nome);
        this.possuiGarantiaEstendida = possuiGarantiaEstendida;
        this.tipoMaterial = tipoMaterial;
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

    @Override
    public String gerarRelatorio() {
        return "--- SECAO ARTIGOS CASA ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Garantia Estendida: " + (possuiGarantiaEstendida ? "Sim" : "Nao") + "\n" +
               "Tipo de Material: " + tipoMaterial;
    }
}