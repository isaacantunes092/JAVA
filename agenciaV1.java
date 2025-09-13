import java.util.Scanner;

public class mainAgencia
{
    public static void main(String[] args) {
		//PROGRAMA PARA FAZER UMA AGENCIA DE VEICULOS
        Scanner sc = new Scanner(System.in);
        int maxCarros = 50; //Numero maximo de armazenamento de veiculos.

        //Array para os veiculos.
        String[] carros = new String[maxCarros];
        double[] precos = new double[maxCarros];

        //total de carros cadastrados
        int total = 0;
        
        while (true) {
            //CRIAÇÃO DO MENU PARA ESCOLHA
            System.out.println("\n -_-_-_-_-_- MENUU -_-_-_-_-_-");
            System.out.println("1 - Mostrar veiculos cadastrados");
            System.out.println("2 - Cadastro de veiculos");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); //LIMPA OS DADOS SALVOS DO ENTER

            if (opcao == 1) {
                if (total == 0) {
                    System.out.println("Nenhum Veiculo Cadastrado.");
                }else{
                    for(int i = 0; i < total; i++){
                        System.out.println((i + 1) + " - " + carros[i] + "| Valor: R$:" + precos[i] );
                    }
                }
            }
            else if (opcao == 2) {
                if (total >= maxCarros) {
                    System.out.println("Estoque cheio");
                    continue;
                }else{
                    System.out.println("Modelo:");
                    carros[total] = sc.nextLine();

                    System.out.println("Valor: ");
                    precos[total] = sc.nextDouble();

                    total++;

                    System.out.println("Veiculo cadastrado com sucesso.");
                }
            }
                else if (opcao == 0) {
                    System.out.println("Fechando o programa");
                    break;
                }else{
                    System.out.println("Opção Invalida");
                }
            }

sc.close();	
}
}
