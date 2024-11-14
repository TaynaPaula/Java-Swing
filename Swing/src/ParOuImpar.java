import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        try {
            // Captura de entrada de dados do usuário com JOptionPane.
            String input = JOptionPane.showInputDialog("Digite um número inteiro:");

            // Converte os dados  string para inteiros
            int numero = Integer.parseInt(input);

            // Analisa se o número digitado é par ou ímpar.
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira um número válido.");
        }
    }
}
