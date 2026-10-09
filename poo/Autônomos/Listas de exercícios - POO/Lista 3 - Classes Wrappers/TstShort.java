// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstShort {

    // i) Classe Short: método reverseBytes()
    // ii) O método inverterBytesShort inverte a ordem dos bytes do valor do tipo
    // short.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html#reverseBytes-short-
    public void inverterBytesShort(short val) {
        short invertido = Short.reverseBytes(val);
        System.out.println("Short original: " + val + " | Bytes invertidos: " + invertido);
    }

    // i) Classe Short: método valueOf()
    // ii) O método criarObjetoShort converte uma String e retorna um objeto do tipo
    // Short.
    // iii) Referência:
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html#valueOf-java.lang.String-
    public void criarObjetoShort(String val_Str) {
        Short s = Short.valueOf(val_Str);
        System.out.println("Objeto Short criado a partir da String: " + s);
    }
}
