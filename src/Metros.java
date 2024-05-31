import java.util.Scanner;

public class Metros {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Digite a quantidade em metros: ");
        double metros = keyboardScanner.nextDouble();
        double cm = metros * 100;
        System.out.println("A quantidade em centímetros é igual a: "+cm);
    }
}
