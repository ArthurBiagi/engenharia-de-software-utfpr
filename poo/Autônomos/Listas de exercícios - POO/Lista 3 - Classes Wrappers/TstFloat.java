// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstFloat {

    // i) Classe Float: método isInfinite()
    // ii) O método verificarInfinito checa se um valor float é infinito.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html#isInfinite-float-
    public void verificarInfinito(float val) {
        boolean eInfinito = Float.isInfinite(val);
        System.out.println("O valor " + val + " é infinito? " + eInfinito);
    }

    // i) Classe Float: método sum()
    // ii) O método somarFloats realiza a soma de dois valores do tipo float.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html#sum-float-float-
    public void somarFloats(float a, float b) {
        float soma = Float.sum(a, b);
        System.out.println("A soma de " + a + " com " + b + " é: " + soma);
    }
}
