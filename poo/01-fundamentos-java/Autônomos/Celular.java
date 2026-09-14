public class Celular {

    String marca = "";
    int ano = 0;

    // Entrada de Dados (atribui valores aos atributos)
    public void entDados(String m, int a) {
        marca = m;
        ano = a;
    }

    // Impressão / Saída de Dados (exibe os dados na tela)
    public void impDados() {
        System.out.println("\n MARCA...: " + getMarca());
        System.out.println(" ANO.....: " + getAno());
    }

    // Getters --> recuperam os valores dos atributos
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    // Setters --> ALTERAM OS VALORES DOS ATRIBUTOS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}