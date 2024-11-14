import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        try {
            // Captura de entrada de dados do usuário com JOptionPane.
            String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
            String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
            String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota:");

            // Converte os dados  string para valores decimais.
            double nota1 = Double.parseDouble(nota1Str);
            double nota2 = Double.parseDouble(nota2Str);
            double nota3 = Double.parseDouble(nota3Str);

            // Cálculo da média
            double media = (nota1 + nota2 + nota3) / 3;

            // Avaliação de aprovação com as notas informadas.
            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "A média foi: " + media + ". O aluno foi Aprovado!");
            } else {
                JOptionPane.showMessageDialog(null, "A média foi: " + media + ". O aluno foi Reprovado!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira valores numéricos válidos.");
        }
    }
}
