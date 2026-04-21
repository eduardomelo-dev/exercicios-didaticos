package ValidationAge;

import java.util.Scanner;

public class ValidationAge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Qual sua idade?");
        idade = scanner.nextInt();

        System.out.println(
            idade <= 3 ? "Bebê" :
            idade <= 7 ? "Criança" :
            idade <= 12 ? "Pré-adolescente" :
            idade <= 20 ? "Adolescente" :
            idade <= 40 ? "Jovem" :
            idade <= 60 ? "Meia-idade" :
            "Idoso"
        );

        scanner.close();
    }
}