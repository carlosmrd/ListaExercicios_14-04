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

        int channel;
        int viewers;
        int channel4Viewers = 0;
        int channel5Viewers = 0;
        int channel7Viewers = 0;
        int channel12Viewers = 0;

        do {
            System.out.print("Insira o número do canal (4, 5, 7, 12), ou 0 para encerrar: ");
            channel = scanner.nextInt();

            if (channel != 0) {
                System.out.print("Insira a quantidade de pessoas da casa: ");
                viewers = scanner.nextInt();

                switch (channel) {
                    case 4: {
                        channel4Viewers += viewers;
                    }
                    break;
                    case 5: {
                        channel5Viewers += viewers;
                    }
                    break;
                    case 7: {
                        channel7Viewers += viewers;
                    }
                    break;
                    case 12: {
                        channel12Viewers += viewers;
                    }
                    break;
                    default: {
                        System.out.println("Canal inexistente, tente novamente.");
                    }
                    break;
                }
            }
        } while (channel != 0);

        int totalViewers = channel4Viewers + channel5Viewers + channel7Viewers + channel12Viewers;

        if (totalViewers != 0) {
            System.out.printf("O canal 4 tinha %d espectador(es), totalizando %.1f%%.\n", channel4Viewers, (double) (channel4Viewers * 100 / totalViewers));
            System.out.printf("O canal 5 tinha %d espectador(es), totalizando %.1f%%.\n", channel4Viewers, (double) (channel5Viewers * 100 / totalViewers));
            System.out.printf("O canal 7 tinha %d espectador(es), totalizando %.1f%%.\n", channel4Viewers, (double) (channel7Viewers * 100 / totalViewers));
            System.out.printf("O canal 12 tinha %d espectador(es), totalizando %.1f%%.\n", channel4Viewers, (double) (channel12Viewers * 100 / totalViewers));
        } else {
            System.out.println("Nenhum espectador foi registrado.");
        }
    }
}
