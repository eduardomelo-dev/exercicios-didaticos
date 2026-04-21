package ValidationAge;

import java.util.Scanner;

public class ValidationAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Qual sua idade?");
        idade = scanner.nextInt();

        if (idade <= 3) {
            System.out.println("Bebê");
        } else if (idade <= 7) {
            System.out.println("Criança");
        } else if (idade <= 12) {
            System.out.println("Pré-adolescente");
        } else if (idade <= 20) {
            System.out.println("Adolescente");
        } else if (idade <= 40) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Meia-idade");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}