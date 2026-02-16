import Pessoa.dev.Developer;
import Pessoa.model.People;
import Pessoa.status.Specialties;
import Pessoa.status.StatusDevExperience;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Usando sistema em: " + now.format(fmt));

        System.out.println("--- SEU PERFIL DE PROGRAMADOR ---");
        System.out.println();

        System.out.print("Qual seu nome dev? ");
        String name = sc.nextLine();

        System.out.print("Sua idade: ");
        int age = sc.nextInt();
        System.out.println("nome: " + name + "idade: "+age);

        System.out.println("---------------");
        System.out.print("Em quantas linguagens você programa? ");
        int languages = sc.nextInt();
        sc.nextLine();
        List<String> newLanguages = new ArrayList<>();
        for (int i=0; i<languages; i++){
            System.out.printf("Linguagem #%d: ", i+1);
            String language = sc.nextLine();
            newLanguages.add(language);
        }
        String level;
        while (true) {
            System.out.print("Seu nível (TRAINEE, JUNIOR, FULL, SENIOR): ");
            level = sc.nextLine().toUpperCase();
            if (!level.equals("TRAINEE") && !level.equals("JUNIOR") && !level.equals("FULL") && !level.equals("SENIOR")) {
                System.out.println("Nível inválido!");
            }
            else {
                break;
            }
        }

        System.out.println("---------------");
        String specialitie;
        while (true) {
            System.out.print("Sua especialidade geral (FRONTEND, BACKEND, FULLSTACK): ");
            specialitie = sc.nextLine().toUpperCase().trim();
            if (!specialitie.equals("FRONTEND") && !specialitie.equals("BACKEND") && !specialitie.equals("FULLSTACK")){
                System.out.println("Especialidade inválida");
            } else {
                break;
            }
        }

        Developer devPeople = new Developer(name, age, newLanguages, StatusDevExperience.valueOf(level), Specialties.valueOf(specialitie));
        System.out.println(devPeople);


        sc.close();
    }
}