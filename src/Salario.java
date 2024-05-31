import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double dinHora = keyboardScanner.nextDouble();
        System.out.println("Digite suas horas trabalhadas no mês: ");
        double horasTrabalhadas = keyboardScanner.nextInt();

        double salario = dinHora * horasTrabalhadas;
        System.out.println("Nesse mês você receberá: R$"+salario);
    }
}
