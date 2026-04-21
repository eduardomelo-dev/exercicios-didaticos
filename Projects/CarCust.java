import java.util.Scanner;

public class CarCust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        double percDistribuidor = 0.0;
        double percImposto = 0.0;

        if (custoFabrica <= 12000.00) {
            percDistribuidor = 0.05;
            percImposto = 0.00;
        } else if (custoFabrica > 12000.00 && custoFabrica <= 25000.00) {
            percDistribuidor = 0.10;
            percImposto = 0.15;
        } else {
            percDistribuidor = 0.15;
            percImposto = 0.20;
        }

        double valorDistribuidor = custoFabrica * percDistribuidor;
        double valorImposto = custoFabrica * percImposto;
        double custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;


        System.out.printf("Custo Final ao Consumidor: R$ %.2f\n", custoConsumidor);

        scanner.close();
    }
}