import javax.swing.JOptionPane;

public class PositivoOuNegativoOuZero {
    public static void main(String[] args) {
        try {
             // Captura de entrada de dados do usuário com JOptionPane.
            String input = JOptionPane.showInputDialog("Digite um número inteiro:");

            // Converte os dados  string para inteiros.
            int numero = Integer.parseInt(input);

            // Analisa se o número digitado é positivo, negativo ou zero.
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo.");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo.");
            } else {
                JOptionPane.showMessageDialog(null, "O número é zero.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira um número válido.");
        }
    }
}
