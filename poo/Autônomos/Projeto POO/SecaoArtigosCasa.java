// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class SecaoArtigosCasa extends Departamento implements Relatorio {
    private boolean possuiGarantiaEstendida;
    private String tipoMaterial;

    //Sobrecarga
    public SecaoArtigosCasa() {
        super();
        this.possuiGarantiaEstendida = false;
        this.tipoMaterial = "";
    }

    //Sobrecarga
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

    //Sobrescrita
    @Override
    public String gerarRelatorio() {
        return "--- SECAO ARTIGOS CASA ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Garantia Estendida: " + (possuiGarantiaEstendida ? "Sim" : "Nao") + "\n" +
               "Tipo de Material: " + tipoMaterial;
    }
}