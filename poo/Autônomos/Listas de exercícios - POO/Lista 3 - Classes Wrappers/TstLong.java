// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstLong {

    // i) Classe Long: método toHexString()
    // ii) O método converterParaHexadecimal converte um valor long para formato
    // hexadecimal em String.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html#toHexString-long-
    public void converterParaHexadecimal(long val) {
        String hex = Long.toHexString(val);
        System.out.println("O valor " + val + " em hexadecimal é: " + hex);
    }

    // i) Classe Long: método bitCount()
    // ii) O método contarBitsUm calcula a quantidade de bits com valor 1 no número
    // long.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html#bitCount-long-
    public void contarBitsUm(long val) {
        int bits = Long.bitCount(val);
        System.out.println("Quantidade de bits '1' em " + val + ": " + bits);
    }
}
