// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstBool {

    // i) Classe Boolean: método parseBoolean()
    // ii) O método convertStr_Bool converte uma String para o tipo primitivo boolean.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html#parseBoolean-java.lang.String-
    public void convertStr_Bool(String val_Str) {
        boolean b = Boolean.parseBoolean(val_Str);
        System.out.println("Resultado de parseBoolean(): " + b);
    }

    // i) Classe Boolean: método logicalAnd()
    // ii) O método operarE_Logico executa a operação lógica AND entre dois valores booleanos.
    // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html#logicalAnd-boolean-boolean-
    public void operarE_Logico(boolean a, boolean b) {
        boolean resultado = Boolean.logicalAnd(a, b);
        System.out.println("Resultado de logicalAnd(" + a + ", " + b + "): " + resultado);
    }
}
