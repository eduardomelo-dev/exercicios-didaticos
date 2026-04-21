import java.util.Scanner;

public class MaiorValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double one;
        double two;
        double three;


        System.out.println("Digite um valor: ");
        one = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        three = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        two = sc.nextDouble();

        if (one > three && one > two) {
            System.out.println("O maior valor é: " + one);
        } else if (three > one && three > two) {
            System.out.println("O maior valor é: " + three);
        } else if (two > one && two > three) {
            System.out.println("O maior valor é: " + two);
        } else {
            System.out.println("Os valores são iguais.");
        }

        sc.close();
    }
}
