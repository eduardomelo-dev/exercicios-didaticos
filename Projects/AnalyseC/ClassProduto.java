package AnalyseC;
import java.util.Scanner;

public class ClassProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco, aumento, novoPreco;
        String classificacao;

        System.out.print("Digite o preço do produto: ");
        preco = sc.nextDouble();

        // cálculo do aumento
        if (preco <= 50.00) {
            aumento = preco * 0.05;
        } else if (preco <= 100.00) {
            aumento = preco * 0.10;
        } else {
            aumento = preco * 0.15;
        }

        novoPreco = preco + aumento;

        // classificação
        if (novoPreco <= 80.00) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.00) {
            classificacao = "Normal";
        } else if (novoPreco <= 200.00) {
            classificacao = "Caro";
        } else {
            classificacao = "Muito caro";
        }

        System.out.printf("Preço original: R$ %.2f\n", preco);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo preço: R$ %.2f\n", novoPreco);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}