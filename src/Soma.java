import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner keyboardScanner  = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        int n1 = keyboardScanner.nextInt();
        int n2 = keyboardScanner.nextInt();
        int n3 = n1 + n2;
        System.out.println("A soma de " + n1 + " e " + n2 + " é igual a " +n3);
    }
}
