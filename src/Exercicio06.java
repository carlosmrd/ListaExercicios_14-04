import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {
    public void executar(Scanner scanner) {

        //Criar a estrutura de dados para armazenar os dados dos pacientes cadastrados no sistema.
        //(Array List)

        ArrayList<String> patientsList = new ArrayList<>();

        patientsList.add("Carlos Oliveira - 24 anos - 123.456.789-01");
        patientsList.add("Arthur Maciel - 25 anos - 109.876.543-21");

        System.out.println("Pacientes cadastrados:");
        for (String patient : patientsList) {
            System.out.println(patient);
        }
    }
}