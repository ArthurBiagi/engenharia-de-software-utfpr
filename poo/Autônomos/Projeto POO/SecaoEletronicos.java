public class SecaoEletronicos extends Departamento implements Relatorio {
    private int voltagem;
    private int mesesGarantia;

    public SecaoEletronicos() {
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    //Sobrescrita
    public double calcularMeta() {
        return 12000.00 * 1.20;
    }

    //Sobrecarga
    public double calcularMeta(double fatorMultiplicador) {
        return 12000.00 * fatorMultiplicador;
    }

    //Sobrescrita
    public double calcularICMS(double valorVendas) {
        return valorVendas * 0.18; // 18% ICMS
    }

    //Sobrescrita
    public String gerarRelatorio() {
        double meta = calcularMeta();
        double icms = calcularICMS(meta);
        return "Setor Eletrônicos [ID: " + getId() + ", Nome: " + getNome() + 
               ", Voltagem: " + voltagem + "V, Garantia: " + mesesGarantia + " meses" + 
               ", Meta: R$ " + meta + ", ICMS Estimado (18%): R$ " + icms + "]";
    }
}
