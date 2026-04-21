package MediaV;

import java.util.Scanner;

public class MediaFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double resultado;

        System.out.println("Qual a primeira nota?");
        nota1 = scanner.nextDouble();

        System.out.println("Qual a segunda nota?");
        nota2 = scanner.nextDouble();

        System.out.println("Qual a terceira nota?");
        nota3 = scanner.nextDouble();

        System.out.println("Qual a quarta nota?");
        nota4 = scanner.nextDouble();

        resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + resultado);

        if (resultado < 7) {
            System.out.println("Reprovado");
        } else  {
            System.out.println("aprovado");
        }

        scanner.close();
    }
}
