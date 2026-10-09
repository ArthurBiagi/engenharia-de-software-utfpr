// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstDoub {

    // i) Classe Double: método isNaN()
    // ii) O método verificarSeNaoENumero checa se o valor de um double é
    // Not-a-Number (NaN).
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#isNaN-double-
    public void verificarSeNaoENumero(double val) {
        boolean eNaN = Double.isNaN(val);
        System.out.println("O valor " + val + " é NaN? " + eNaN);
    }

    // i) Classe Double: método max()
    // ii) O método obterMaiorDouble compara dois valores double e retorna o maior
    // deles.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#max-double-double-
    public void obterMaiorDouble(double a, double b) {
        double maior = Double.max(a, b);
        System.out.println("O maior valor entre " + a + " e " + b + " é: " + maior);
    }
}
