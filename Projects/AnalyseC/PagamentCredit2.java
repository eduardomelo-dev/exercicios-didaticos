package AnalyseC;
import java.util.Scanner;

public class PagamentCredit2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldoMedio, valorCredito;

        System.out.print("Digite o salário: ");
        saldoMedio = sc.nextDouble();

        if (saldoMedio <= 300.00) {
            valorCredito = saldoMedio * 0.15;
        } else if (saldoMedio <= 600.00) {
            valorCredito = saldoMedio * 0.10;
        } else if (saldoMedio <= 900.00) {
            valorCredito = saldoMedio * 0.05;
        } else {
            valorCredito = 0;
        }

        System.out.printf("Salário: R$ %.2f\n", saldoMedio);
        System.out.printf("Aumento: R$ %.2f\n", valorCredito);
        System.out.printf("Novo salário: R$ %.2f\n", saldoMedio + valorCredito);

        sc.close();
    }
}