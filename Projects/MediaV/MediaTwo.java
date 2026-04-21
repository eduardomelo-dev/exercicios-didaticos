package MediaV;

import java.util.Scanner;

public class MediaTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double resultado;

        System.out.println("Qual a primeira nota?");
        nota1 = scanner.nextDouble();

        System.out.println("Qual a segunda nota?");
        nota2 = scanner.nextDouble();

        resultado = (nota1 + nota2) / 2;

        System.out.println("Média: " + resultado);

        if (resultado <= 4) {
            System.out.println("Reprovado");
        } else if (resultado <=7 ) {
            System.out.println("Realizar prova final");
        } else {
            System.out.println("Aprovado, parabéns!");
        }

        scanner.close();
    }
}