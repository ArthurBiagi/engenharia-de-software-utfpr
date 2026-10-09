// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstChar {

    // i) Classe Character: método isDigit()
    // ii) O método checarSeEDigito verifica se determinado caractere é um dígito
    // numérico.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-
    public void checarSeEDigito(char ch) {
        boolean eDigito = Character.isDigit(ch);
        System.out.println("O caractere '" + ch + "' é um dígito? " + eDigito);
    }

    // i) Classe Character: método toUpperCase()
    // ii) O método converterParaMaiusculo converte um caractere para sua forma em
    // maiúscula.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toUpperCase-char-
    public void converterParaMaiusculo(char ch) {
        char maiusculo = Character.toUpperCase(ch);
        System.out.println("Caractere '" + ch + "' em maiúsculo: " + maiusculo);
    }
}
