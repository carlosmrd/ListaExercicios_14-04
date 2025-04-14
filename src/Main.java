import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Menu de exercícios.");
            System.out.println("Digite o número de um exercício para executá-lo.");
            System.out.println("Digite 0 para sair.");
            option = scanner.nextInt();

            switch (option) {
                case 0: {
                    System.out.println("O programa será encerrado.");
                }
                break;
                case 1: {
                    System.out.println("Iniciando a execução do exercício 1.\n");
                    Exercicio01 ex01 = new Exercicio01();
                    ex01.executar(scanner);
                }
                break;
                case 2: {
                    System.out.println("Iniciando a execução do exercício 2.\n");
                    Exercicio02 ex02 = new Exercicio02();
                    ex02.executar(scanner);
                }
                break;
                case 3: {
                    System.out.println("Iniciando a execução do exercício 3.\n");
                    Exercicio03 ex03 = new Exercicio03();
                    ex03.executar(scanner);
                }
                break;
                case 4: {
                    System.out.println("Iniciando a execução do exercício 4.\n");
                    Exercicio04 ex04 = new Exercicio04();
                    ex04.executar(scanner);
                }
                break;
                case 5: {
                    System.out.println("Iniciando a execução do exercício 5.\n");
                    Exercicio05 ex05 = new Exercicio05();
                    ex05.executar(scanner);
                }
                break;
                case 6: {
                    System.out.println("Iniciando a execução do exercício 6.\n");
                    Exercicio06 ex06 = new Exercicio06();
                    ex06.executar(scanner);
                }
                break;
                case 7: {
                    System.out.println("Iniciando a execução do exercício 7.\n");
                    Exercicio07 ex07 = new Exercicio07();
                    ex07.executar(scanner);
                }
                break;
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
                break;
            }
            System.out.println();
        } while (option != 0);

        scanner.close();
    }
}
