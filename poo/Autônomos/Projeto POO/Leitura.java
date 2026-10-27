// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

    //Sobrecarga
    public String entDados(String rotulo) {
        System.out.print(rotulo);
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String entrada = "";
        try {
            entrada = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro na entrada de dados via teclado.");
        }
        return entrada;
    }
}
