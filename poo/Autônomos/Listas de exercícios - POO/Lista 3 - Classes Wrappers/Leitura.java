//Arthur Valsezia dos Santos Biagi RA: 2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Leitura {

    public String entDados(String rotulo) {
        System.out.print(rotulo);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        try {
            entrada = br.readLine();
        } catch (IOException e) {
            System.out.println("Erro na leitura dos dados: " + e.getMessage());
        }
        return entrada;
    }
}
