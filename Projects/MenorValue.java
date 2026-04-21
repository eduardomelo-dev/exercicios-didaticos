import java.util.Scanner;

public class MenorValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double menor;
        double maior;

        System.out.println("Digite um valor: ");
        menor = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        maior = sc.nextDouble();

        if (menor < maior) {
            System.out.println("O menor valor é: " + menor);
        } else if (maior < menor) {
            System.out.println("O menor valor é: " + maior);
        } else {
            System.out.println("Os valores são iguais.");
        }

        sc.close();

    }
}
