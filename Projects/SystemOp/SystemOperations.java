package SystemOp;

import java.util.Scanner;

public class SystemOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;
        int opcao;

        System.out.println("Bem vindo ao programa de operações!");

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Média");
        System.out.println("2 - Diferença");
        System.out.println("3 - Produto");
        System.out.println("4 - Divisão");

        opcao = sc.nextInt();

        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida!");
        } else {

            System.out.print("Digite o primeiro valor: ");
            num1 = sc.nextDouble();

            System.out.print("Digite o segundo valor: ");
            num2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = (num1 + num2) / 2;
                    System.out.println("Média: " + resultado);
                    break;

                case 2:
                    if (num1 > num2) {
                        resultado = num1 - num2;
                    } else {
                        resultado = num2 - num1;
                    }
                    System.out.println("Diferença: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Produto: " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Divisão: " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
            }
        }

        sc.close();
    }
}