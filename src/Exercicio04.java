import java.util.Scanner;

public class Exercicio04 {
    public void executar(Scanner scanner) {

        //Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros
        //termos da seguinte série: S = 1000/1 − 997/2 + 994/3 − 991/4 + . . .

        double number1 = 1000;
        double number2 = 1;
        double finalNumber = 0;

        for (int i = 0; i < 50; i++) {
            finalNumber += number1 / number2;
            number1 -= 3;
            number2++;
        }

        System.out.println(finalNumber);
    }
}
