import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = keyboardScanner.nextInt();
        int n2 = keyboardScanner.nextInt();
        System.out.println("Digite um número real: ");
        double n3 = keyboardScanner.nextDouble();

        int contaA = (n1 * 2) * (n2 /2);
        double contaB = (n1 * 3) + n3;
        double contaC = (n3*n3)*n3;
        System.out.println("Conta a: " + contaA);
        System.out.println("Conta b: " + contaB);
        System.out.println("Conta c: " + contaC);
     }
}
