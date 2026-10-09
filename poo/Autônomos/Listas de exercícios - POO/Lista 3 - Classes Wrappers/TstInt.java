//Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstInt {

    // i) Classe Integer: método parseInt()
    // ii) O método convertStr_Int irá converter o valor de uma String para o tipo primitivo int.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-
    public void convertStr_Int(String val_Str) {
        int x = Integer.parseInt(val_Str);
        System.out.println("Resultado de parseInt(): " + x);
    }

    // i) Classe Integer: método toString()
    // ii) O método convertInt_Str irá converter o valor de um tipo int para uma String.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#toString-int-
    public void convertInt_Str(int val_Int) {
        String frase = Integer.toString(val_Int);
        System.out.println("Resultado de toString(): " + frase);
    }
}
