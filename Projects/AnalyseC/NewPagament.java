package AnalyseC;

import java.util.Scanner;

public class NewPagament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();

        if (salario < 500) {
            novoSalario = salario * 1.30;
            System.out.println("Novo salário com aumento: " + novoSalario);
        } else {
            System.out.println("Funcionário não tem direito ao aumento.");
        }

        sc.close();
    }
}
