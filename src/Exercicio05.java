import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {
    public void executar(Scanner scanner) {

        //Criar a estrutura de dados para armazenar os médicos cadastrados no sistema. (Array List)

        ArrayList<String> medicsList = new ArrayList<>();

        medicsList.add("Carlos Oliveira - Cardiologista - CRM12345");
        medicsList.add("Arthur Maciel - Cardiologista - CRM54321");

        System.out.println("Médicos cadastrados:");
        for (String medic : medicsList) {
            System.out.println(medic);
        }
    }
}
