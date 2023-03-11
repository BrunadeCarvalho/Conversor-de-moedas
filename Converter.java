import javax.swing.*;

public class Converter {
    public static void main(String[] args) {
        String[] opcoes = {"Dólar para Euro", "Dólar para Real", "Euro para Dólar", "Euro para Real",
                "Real para Dólar", "Real para Euro"};
        String input = (String) JOptionPane.showInputDialog(null, "Esolha uma opção", "Conversor de moedas",
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes,
                opcoes[1]);
        System.out.println(input);
    }
}
