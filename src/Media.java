import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Digite suas 4 notas bimestrais: ");
        double nota1 = keyboardScanner.nextInt();
        double nota2 = keyboardScanner.nextInt();
        double nota3 = keyboardScanner.nextInt();
        double nota4 = keyboardScanner.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média de " +nota1+ ", " +nota2+ ", "+nota3+ " e " +nota4+ " é igual a " + media);
    }
}
