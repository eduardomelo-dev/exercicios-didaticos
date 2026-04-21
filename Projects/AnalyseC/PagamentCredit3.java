package AnalyseC;
import java.util.Scanner;

public class PagamentCredit3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, gratificacao;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();

        // cálculo da gratificação
        if (salario <= 350.00) {
            gratificacao = 100.00;
        } else if (salario <= 600.00) {
            gratificacao = 75.00;
        } else if (salario <= 900.00) {
            gratificacao = 50.00;
        } else {
            gratificacao = 35.00;
        }

        double salarioComAumento = salario + gratificacao;

        // cálculo do imposto (7%)
        double imposto = salarioComAumento * 0.07;

        // salário final
        double salarioFinal = salarioComAumento - imposto;

        System.out.printf("Salário original: R$ %.2f\n", salario);
        System.out.printf("Gratificação: R$ %.2f\n", gratificacao);
        System.out.printf("Salário com aumento: R$ %.2f\n", salarioComAumento);
        System.out.printf("Imposto (7%%): R$ %.2f\n", imposto);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);

        sc.close();
    }
}