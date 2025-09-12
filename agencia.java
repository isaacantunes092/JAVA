import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
		//PROGRAMA PARA FAZER UMA AGENCIA DE VEICULOS
        Scanner sc  = new Scanner(System.in);
        String[] carros = {"Civic", "Jetta", "Golf", "Fusion"};
        System.out.println("Carros disponiveis");
        for(int i = 0; i < carros.length; i++){
            System.out.println(i + " - " + carros[i]);
        }
        System.out.println("");
        System.out.println("Qual o carro escolhido? ");
        System.out.println("");

        int escolha = sc.nextInt();
        if(escolha == 0){
            System.out.println("Ficha Tecnica");
            System.out.println("Modelo: Civic\nAno: 2020 \nMotor: 2.0 16V i-VTEC FlexOne \nTransmissão: Automática CVT com 7 marchas\nSedan 4 portas \nPreço: R$ 95.000");
        }else if(escolha == 1){
            System.out.println("Ficha Tecnica");
            System.out.println("Modelo: Jetta\nAno: 2021 \nMotor: 1.4 250 TSI Flex VVT Turbo \nTransmissão: Automatico TipTronic de 6 velocidades\nSedan 4 portas \nPreço: R$ 110.000"); 
        }else if(escolha == 2){;
            System.out.println("Ficha Tecnica");
            System.out.println("Modelo: Golf\nAno: 2019 \nMotor: 1.4 250 TSI Flex VVT Turbo \nTransmissão: Automática/Sequencial de 6 velocidades (com conversor de torque) \nHatch 4 portas \nPreço: R$ 90.000");
        }else if(escolha == 3){
            System.out.println("Ficha Tecnica");
            System.out.println("Modelo: Fusion\nAno: 2018\nMotor: Duratec 2.5 Flex VVT aspirado \nTransmissão: Automática/Sequencial de 6 velocidades \nSedan 4 portas \nPreço: R$ 85.000");
        }else {
            System.out.println("Veiculo não encontrado");
        }

	}
}
