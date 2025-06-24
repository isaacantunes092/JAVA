import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int n;
        int x, soma;

        System.out.printf("Insira o primeiro numero: \n");
        n = ler.nextInt();

        System.out.printf("Insira o segundo numero: \n");
        x = ler.nextInt();

        System.out.println("RESULTADOS \n");
        System.out.println("O Resultado da soma é: \n" + (n + x));
        System.out.println("O Resutado da Subtração é: \n" + (n - x));
        System.out.println("O Resultado da Multiplicação é: \n" + (n * x));
        System.out.println("O Resultado da Divisão Inteira é: \n" + (n / x));
        System.out.println("O Resultado da Divisão Exata é: \n" + ((double)n / x));

    }
}
