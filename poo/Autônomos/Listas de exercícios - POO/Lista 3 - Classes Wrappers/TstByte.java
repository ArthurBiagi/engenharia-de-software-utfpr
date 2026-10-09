// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstByte {

    // i) Classe Byte: método decode()
    // ii) O método decodificarStringByte converte uma String (decimal ou hexadecimal) em um Byte.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html#decode-java.lang.String-
    public void decodificarStringByte(String val_Str) {
        Byte b = Byte.decode(val_Str);
        System.out.println("Valor decodificado para Byte: " + b);
    }

    // i) Classe Byte: método compare()
    // ii) O método compararBytes compara numericamente dois valores do tipo byte.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html#compare-byte-byte-
    public void compararBytes(byte x, byte y) {
        int res = Byte.compare(x, y);
        System.out.println("Resultado da comparação entre os bytes " + x + " e " + y + ": " + res);
    }
}
