import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Digite umm número: ");
        int numero = keyboardScanner.nextInt();
        System.out.println("O número digitado foi: "+numero);
    }
}
