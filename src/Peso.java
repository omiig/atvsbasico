import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = keyboardScanner.nextDouble();

        System.out.println("Você é homem ou mulher? | H - Homem | M - Mulher");
        char genero = keyboardScanner.next().charAt(0);

        System.out.println("Qual o seu peso atual?");
        double peso = keyboardScanner.nextDouble();

        if (genero == 'h' || genero == 'H') {
            double pesoIdeal = (72.7 * altura) - 58;
            if (peso > pesoIdeal) {
                System.out.println("Você está acima do peso, o peso ideal é " + pesoIdeal+"kg");
            } else if (peso < pesoIdeal) {
                System.out.println("Você está abaixo do peso, o peso ideal é " + pesoIdeal+"kg");
            } else {
                System.out.println("Você está no peso ideal");
            }
        } else if (genero == 'm' || genero == 'M') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            if (peso > pesoIdeal) {
                System.out.println("Você está acima do peso, o peso ideal é " + pesoIdeal+"kg");
            } else if (peso < pesoIdeal) {
                System.out.println("Você está abaixo do peso, o peso ideal é " + pesoIdeal+"kg");
            } else {
                System.out.println("Você está no peso ideal");
            }
        } else {
            System.out.println("OPÇÃO INVÁLIDA");
        }


    }
}
