package AnalyseC;

import java.util.Scanner;

public class AnalyseCredit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Qvalor;
        int Qpessoa;
        double resultado;

        System.out.println("Bem Vindo a SOS emprestimos!");

        System.out.println("Qual sua renda mensal familiar comprovada?");
        Qvalor = scanner.nextDouble();

        System.out.println("Qual a quantidade de pessoas da sua familia?");
        Qpessoa = scanner.nextInt();

        resultado = Qvalor / Qpessoa;

        if (resultado <= 200) {
            System.out.println("Emprestimo reprovado");
        } else {
            System.out.println("Emprestimo aprovado, renda familiar compativel");
        }

        scanner.close();
    }
}