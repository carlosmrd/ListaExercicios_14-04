import java.util.Scanner;

public class Exercicio01 {
    public void executar(Scanner scanner) {

        //Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em
        //determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o
        //número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada
        //era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
        //• leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
        //• calcule e mostre a porcentagem de audiência de cada canal.
        //Para encerrar a entrada de dados, digite o número do canal ZERO.

        System.out.println("Teste");

        int channel = 0;
        int viewers;

        do {
            System.out.print("Insira o número do canal, ou 0 para encerrar: ");
            channel = scanner.nextInt();

            System.out.print("Insira a quantidade de pessoas da casa: ");
            viewers = scanner.nextInt();


        } while (channel != 0);

    }
}
