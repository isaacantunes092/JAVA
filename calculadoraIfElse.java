import java.util.Scanner;

public class calculadoraIfElse {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int x, y, i;
        float resultado;
        float a,b; //declaração de variaveis

        System.out.println("CALCULADORA \n");
        System.out.println("1 - SOMA: ");
        System.out.println("2 - SUBTRAÇÃO: ");
        System.out.println("3 - MULTIPLICAÇÃO: ");
        System.out.println("4 - DIVISÃO: ");
        System.out.println("\nSelecione a opção desejada: ");
        i = ler.nextInt();
        do{
            if(i  == 1){
            System.out.printf("Insira o primeiro numero: \n");
            y = ler.nextInt();
            System.out.printf("Insira o segundo numero: \n");
            x = ler.nextInt();
            resultado = x + y;
            System.out.println("O Resultado da soma é: \n" + resultado);
        }else if(i == 2){
            System.out.printf("Insira o primeiro numero: \n");
            y = ler.nextInt();
            System.out.printf("Insira o segundo numero: \n");
            x = ler.nextInt();
            resultado = (y - x);
            System.out.println("O Resultado da subtração é: \n" + resultado);
        }else if(i == 3){
            System.out.printf("Insira o primeiro numero: \n");
            y = ler.nextInt();
            System.out.printf("Insira o segundo numero: \n");
            x = ler.nextInt();
            resultado = x * y;
            System.out.println("O Resultado da multiplicação é: \n" + resultado);
        }else if(i == 4){
            System.out.printf("Insira o primeiro numero: \n");
            a = ler.nextInt();
            System.out.printf("Insira o segundo numero: \n");
            b = ler.nextInt();
            resultado = (a / b);
            System.out.println("O Resultado da divisão é: \n" + resultado);
        }else{
            System.out.println("Opção Invalida");
        }
        System.out.println("Deseja realizar uma nova operação? S/N");
        char novaOperacao = ler.next().charAt(0);
        if (novaOperacao == 'n') {
            System.out.println("Fim de Operação");
            break;
        }
    }while(true);
    }
        
}


