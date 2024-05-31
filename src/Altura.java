import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = keyboardScanner.nextDouble();
        System.out.println("Você é homem ou mulher? | H - Homem | M - Mulher");
        char genero = keyboardScanner.next().charAt(0);

        if (genero == 'h' || genero == 'H') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é igual a: " + pesoIdeal);
        } else if (genero == 'm' || genero == 'M') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é igual a : " + pesoIdeal);
        } else {
            System.out.println("OPÇÃO INVÁLIDA");
        }
    }
}
