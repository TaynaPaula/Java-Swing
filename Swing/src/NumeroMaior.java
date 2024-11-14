import javax.swing.JOptionPane;

public class NumeroMaior {
    public static void main(String[] args) {
        try {
            // Captura de entrada de dados do usuário com JOptionPane.
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
            String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

            // Converte os dados  string para inteiros.
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Analisa qual número é maior ou se foi digitado numeros iguais.
            if (num1 > num2) {
                JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
            } else if (num2 > num1) {
                JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
            } else {
                JOptionPane.showMessageDialog(null, "Ambos os números são iguais.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira um número válido.");
        }
    }
}
