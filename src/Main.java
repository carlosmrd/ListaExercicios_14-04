import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opt;

        do {
            System.out.println("Menu de exercícios.");
            System.out.println("Digite o número de um exercício para executá-lo.");
            System.out.println("Digite 0 para sair.");
            opt = scanner.nextInt();

            switch (opt) {
                case 0: {
                    System.out.println("O programa será encerrado.");
                }
                break;
                case 1: {
                    System.out.println("Iniciando a execução do exercício 1.\n");
                    Exercicio01 ex1 = new Exercicio01();
                    ex1.executarExercicio01(scanner);
                }
                break;
                case 2: {
                    System.out.println("Iniciando a execução do exercício 2.\n");
                    Exercicio02 ex2 = new Exercicio02();
                    ex2.executarExercicio02(scanner);
                }
                break;
                case 3: {
                    System.out.println("Iniciando a execução do exercício 3.\n");
                    Exercicio03 ex3 = new Exercicio03();
                    ex3.executarExercicio03(scanner);
                }
                break;
                case 4: {
                    System.out.println("Iniciando a execução do exercício 4.\n");
                    Exercicio04 ex4 = new Exercicio04();
                    ex4.executarExercicio04(scanner);
                }
                break;
                case 5: {
                    System.out.println("Iniciando a execução do exercício 5.\n");
                    Exercicio05 ex5 = new Exercicio05();
                    ex5.executarExercicio05(scanner);
                }
                break;
                case 6: {
                    System.out.println("Iniciando a execução do exercício 6.\n");
                    Exercicio06 ex6 = new Exercicio06();
                    ex6.executarExercicio06(scanner);
                }
                break;
                case 7: {
                    System.out.println("Iniciando a execução do exercício 7.\n");
                    Exercicio07 ex7 = new Exercicio07();
                    ex7.executarExercicio07(scanner);
                }
                break;
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
                break;
            }
            System.out.println();
        } while (opt != 0);

        scanner.close();
    }
}
