package AnalyseC;

import java.util.Scanner;

public class PagamentCredit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoMedio, valorCredito;

        System.out.print("Digite o salário: ");
        saldoMedio = sc.nextDouble();

        if (saldoMedio > 400.00) {
            valorCredito = saldoMedio * 0.30;
        } else if (saldoMedio > 300.00 && saldoMedio <= 400.00) {
            valorCredito = saldoMedio * 0.25;
        } else if (saldoMedio > 200.00 && saldoMedio <= 300.00) {
            valorCredito = saldoMedio * 0.20;
        } else {
            valorCredito = saldoMedio * 0.10;
        }

        System.out.printf("Saldo Médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do Crédito: R$ %.2f\n", valorCredito);

        sc.close();
    }
}
