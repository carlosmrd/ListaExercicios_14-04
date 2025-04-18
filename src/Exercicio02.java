import java.util.Scanner;

public class Exercicio02 {
    public void executar(Scanner scanner) {

        //. Faça um programa que apresente o menu de opções a seguir:
        //Menu de opções:
        //1. Média aritmética
        //2. Média ponderada
        //3. Sair
        //Digite a opção desejada.
        //Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
        //Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
        //Na opção 3: sair do programa.
        //Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.

        int option;

        do {
            System.out.println("Menu de opções:");
            System.out.println("\t1. Média aritmética");
            System.out.println("\t2. Média ponderada");
            System.out.println("\t3. Sair");
            System.out.print("Selecione uma opção: ");
            option = scanner.nextInt();
            System.out.println();


            double firstScore;
            double firstWeight;
            double secondScore;
            double secondWeight;
            double thirdScore;
            double thirdWeight;
            double result;

            switch (option) {
                case 1: {
                    System.out.println("Média aritmética:\n");

                    System.out.print("Insira a primeira nota: ");
                    firstScore = scanner.nextDouble();

                    System.out.print("Insira a segunda nota: ");
                    secondScore = scanner.nextDouble();

                    result = (firstScore + secondScore) / 2;

                    System.out.printf("A média aritmética é %.2f\n", result);
                }
                break;
                case 2: {
                    System.out.println("Média ponderada:\n");

                    System.out.print("Insira a primeira nota: ");
                    firstScore = scanner.nextDouble();

                    System.out.print("Insira o peso da primeira nota: ");
                    firstWeight = scanner.nextDouble();

                    System.out.print("Insira a segunda nota: ");
                    secondScore = scanner.nextDouble();

                    System.out.print("Insira o peso da segunda nota: ");
                    secondWeight = scanner.nextDouble();

                    System.out.print("Insira a terceira nota: ");
                    thirdScore = scanner.nextDouble();

                    System.out.print("Insira o peso da terceira nota: ");
                    thirdWeight = scanner.nextDouble();

                    result = ((firstScore * firstWeight) + (secondScore * secondWeight) + (thirdScore * thirdWeight)) / (firstWeight + secondWeight + thirdWeight);

                    System.out.printf("A média ponderada é %.2f\n", result);                }
                break;
                case 3: {
                    System.out.println("Encerrando o programa.");
                }
                break;
                default:
                    System.out.println("Opção inválida, insira novamente.");
            }
            System.out.println();
        } while (option != 3);
    }
}
