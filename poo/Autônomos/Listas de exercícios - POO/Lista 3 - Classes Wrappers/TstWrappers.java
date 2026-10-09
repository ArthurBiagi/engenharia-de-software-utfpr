// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstWrappers {

    public static void main(String[] args) {
        Leitura leitura = new Leitura();

        TstInt tstInt = new TstInt();
        TstBool tstBool = new TstBool();
        TstChar tstChar = new TstChar();
        TstDoub tstDoub = new TstDoub();
        TstByte tstByte = new TstByte();
        TstShort tstShort = new TstShort();
        TstFloat tstFloat = new TstFloat();
        TstLong tstLong = new TstLong();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n------------------------------------------");
            System.out.println("USO DE CLASSES WRAPPERS");
            System.out.println("1) INTEGER");
            System.out.println("2) BOOLEAN");
            System.out.println("3) CHARACTER");
            System.out.println("4) DOUBLE");
            System.out.println("5) BYTE");
            System.out.println("6) SHORT");
            System.out.println("7) FLOAT");
            System.out.println("8) LONG");
            System.out.println("0) SAIR");
            System.out.println("------------------------------------------");

            String strOpcao = leitura.entDados("ESCOLHA UMA OPCAO: ");

            try {
                opcao = Integer.parseInt(strOpcao);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("--- EXEMPLO INTEGER ---");
                    String valStrInt = leitura.entDados("Digite um valor numérico inteiro (em texto): ");
                    tstInt.convertStr_Int(valStrInt);

                    String valIntNum = leitura.entDados("Digite um número int para converter em String: ");
                    int numInt = Integer.parseInt(valIntNum);
                    tstInt.convertInt_Str(numInt);
                    break;

                case 2:
                    System.out.println("--- EXEMPLO BOOLEAN ---");
                    String strBool = leitura.entDados("Digite 'true' ou 'false': ");
                    tstBool.convertStr_Bool(strBool);
                    tstBool.operarE_Logico(true, false);
                    break;

                case 3:
                    System.out.println("--- EXEMPLO CHARACTER ---");
                    String strChar = leitura.entDados("Digite um caractere: ");
                    char c = strChar.isEmpty() ? ' ' : strChar.charAt(0);
                    tstChar.checarSeEDigito(c);
                    tstChar.converterParaMaiusculo(c);
                    break;

                case 4:
                    System.out.println("--- EXEMPLO DOUBLE ---");
                    String d1Str = leitura.entDados("Digite o 1º número decimal (Double): ");
                    String d2Str = leitura.entDados("Digite o 2º número decimal (Double): ");
                    double d1 = Double.parseDouble(d1Str);
                    double d2 = Double.parseDouble(d2Str);
                    tstDoub.verificarSeNaoENumero(d1);
                    tstDoub.obterMaiorDouble(d1, d2);
                    break;

                case 5:
                    System.out.println("--- EXEMPLO BYTE ---");
                    String byteStr = leitura.entDados("Digite um valor byte (ex: 15 ou 0x0F): ");
                    tstByte.decodificarStringByte(byteStr);
                    tstByte.compararBytes((byte) 5, (byte) 12);
                    break;

                case 6:
                    System.out.println("--- EXEMPLO SHORT ---");
                    String shortStr = leitura.entDados("Digite um valor short (ex: 1000): ");
                    tstShort.inverterBytesShort(Short.parseShort(shortStr));
                    tstShort.criarObjetoShort(shortStr);
                    break;

                case 7:
                    System.out.println("--- EXEMPLO FLOAT ---");
                    String f1Str = leitura.entDados("Digite o 1º valor float: ");
                    String f2Str = leitura.entDados("Digite o 2º valor float: ");
                    float f1 = Float.parseFloat(f1Str);
                    float f2 = Float.parseFloat(f2Str);
                    tstFloat.verificarInfinito(f1);
                    tstFloat.somarFloats(f1, f2);
                    break;

                case 8:
                    System.out.println("--- EXEMPLO LONG ---");
                    String longStr = leitura.entDados("Digite um número long: ");
                    long l = Long.parseLong(longStr);
                    tstLong.converterParaHexadecimal(l);
                    tstLong.contarBitsUm(l);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número de 0 a 8.");
                    break;
            }
        }
    }
}