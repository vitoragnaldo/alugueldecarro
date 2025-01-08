import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando alguns carros para aluguel
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 100.0);
        Carro carro2 = new Carro("Honda", "Civic", 2019, 120.0);
        Carro carro3 = new Carro("Chevrolet", "Onix", 2021, 80.0);

        // Lista de carros disponíveis
        Carro[] carrosDisponiveis = {carro1, carro2, carro3};

        int opcao;
        do {
            System.out.println("\n--- Sistema de Aluguel de Carros ---");
            System.out.println("1. Consultar carros disponíveis");
            System.out.println("2. Alugar um carro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Carros Disponíveis ---");
                    for (int i = 0; i < carrosDisponiveis.length; i++) {
                        System.out.println("Carro " + (i + 1) + ":");
                        System.out.println(carrosDisponiveis[i].exibirDetalhes());
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do carro que deseja alugar (1, 2 ou 3): ");
                    int numeroCarro = scanner.nextInt();
                    if (numeroCarro < 1 || numeroCarro > 3) {
                        System.out.println("Carro inválido. Tente novamente.");
                        break;
                    }

                    System.out.print("Digite o número de dias que deseja alugar: ");
                    int diasAlugados = scanner.nextInt();

                    // Criando o aluguel do carro
                    Aluguel aluguel = new Aluguel(carrosDisponiveis[numeroCarro - 1], diasAlugados);
                    aluguel.exibirResumoAluguel();
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}