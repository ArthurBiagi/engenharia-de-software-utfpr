import javax.swing.JOptionPane;

public class CxDialog{

    public static void main(String arg[]){
        /*JOptionPane.showMessageDialog(
            null,
            "Na próxima caixa informe um nome - \n X vale: "+x,
            "Primeira Entrada de Dados",
            //JOptionPane.PLAIN_MESSAGE
            //JOptionPane.INFORMATION_MESSAGE
            //JOptionPane.ERROR_MESSAGE
            //JOptionPane.QUESTION_MESSAGE
            
        );*/

        String nome = JOptionPane.showInputDialog(
            null,
            "Informe um nome: ",
            "Entrada de Dados",
            JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "O nome escolhido foi: "+nome,
            "Entrada de Dados",
            JOptionPane.INFORMATION_MESSAGE
            
        );
    }
}
