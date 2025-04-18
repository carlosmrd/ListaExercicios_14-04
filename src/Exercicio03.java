import java.util.Scanner;

public class Exercicio03 {
    public void executar(Scanner scanner) {

        //Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
        //• a média das idades das dez pessoas;
        //• o total que possui superior a 90 kg e altura inferior a 1,50 metro;
        //1
        //• a porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de
        //1,90 m;
        //• uma opção para apresentar todos os dados coletados;

        final int totalPersons = 10;

        int[] ages = new int[totalPersons];
        double[] weights = new double[totalPersons];
        double[] heights = new double[totalPersons];

        int totalAges = 0;
        int counterInfHeightSupWeight = 0;
        int counterHeight190 = 0;
        int counterSpecificAgeSupHeight = 0;

        for (int i = 0; i < totalPersons; i++) {
            System.out.printf("Insira a idade da %dª pessoa: ", i + 1);
            ages[i] = scanner.nextInt();

            System.out.printf("Insira o peso (kg) da %dª pessoa: ", i + 1);
            weights[i] = scanner.nextDouble();

            System.out.printf("Insira a altura (m) da %dª pessoa: ", i + 1);
            heights[i] = scanner.nextDouble();

            totalAges += ages[i];

            if (weights[i] > 90 && heights[i] < 1.50) {
                counterInfHeightSupWeight++;
            }

            if (heights[i] > 1.90) {
                counterHeight190++;
                if (ages[i] >= 10 && ages[i] <= 30) {
                    counterSpecificAgeSupHeight++;
                }
            }
        }

        double averageAges = (double) totalAges / totalPersons;
        double percentage = counterHeight190 > 0 ? (double) counterSpecificAgeSupHeight / counterHeight190 * 100 : 0;

        System.out.printf("\nMédia das idades: %.2f\n", averageAges);
        System.out.printf("Total de pessoas com mais de 90kg e menos de 1.50m: %d\n", counterInfHeightSupWeight);
        System.out.printf("Porcentagem de pessoas entre 10 e 30 anos entre as que medem mais de 1.90m: %.2f%%\n", percentage);

        System.out.print("\nDeseja exibir todos os dados coletados? (s/n): ");
        char option = scanner.next().toLowerCase().charAt(0);
        if (option == 's') {
            for (int i = 0; i < totalPersons; i++) {
                System.out.printf("Pessoa %d - Idade: %d anos, Peso: %.0fkg, Altura: %.2fm\n",
                        i + 1, ages[i], weights[i], heights[i]);
            }
        }
    }
}
