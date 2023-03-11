import javax.swing.*;
import java.text.DecimalFormat;

public class Converter {
    public static void main(String[] args) {
        String[] opcoes = {"Dólar para Euro", "Dólar para Real", "Euro para Dólar", "Euro para Real",
                "Real para Dólar", "Real para Euro"};

        boolean continuar = true;

        while(continuar){
            String escolha = (String) JOptionPane.showInputDialog(null, "Esolha uma opção", "Conversor de moedas",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes,
                    opcoes[1]);

            if(escolha != null){
                String valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja converter:", "Conversor de moedas", JOptionPane.PLAIN_MESSAGE);

                if(valor != null && !valor.isEmpty()){
                    double resultado = Double.parseDouble(valor);

                    double taxa = 0.0;
                    String simbolo = "";

                    switch (escolha) {
                        case "Dólar para Euro" -> {
                            taxa = 0.94;
                            simbolo = "€";
                        }
                        case "Dólar para Real" -> {
                            taxa = 5.22;
                            simbolo = "R$";
                        }
                        case "Euro para Dólar" -> {
                            taxa = 1.07;
                            simbolo = "$";
                        }
                        case "Euro para Real" -> {
                            taxa = 5.56;
                            simbolo = "R$";
                        }
                        case "Real para Dólar" -> {
                            taxa = 0.19;
                            simbolo = "$";
                        }
                        case "Real para Euro" -> {
                            taxa = 0.18;
                            simbolo = "€";
                        }
                    }

                    DecimalFormat df = new DecimalFormat("0.00");


                    double valorFinal = (resultado * taxa);
                    JOptionPane.showMessageDialog(null, "O valor da conversão é de " + simbolo + (df.format(valorFinal)), "Conversor de moedas", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido", "Conversor de moedas", JOptionPane.ERROR_MESSAGE);
            }

            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.NO_OPTION) {
                continuar = false;
            } else if (response == JOptionPane.CLOSED_OPTION) {
                continuar = false;
            }
        }
    }
}