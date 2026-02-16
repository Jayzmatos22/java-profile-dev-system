package Pessoa.dev;

import Pessoa.model.People;
import Pessoa.status.Specialties;
import Pessoa.status.StatusDevExperience;

import java.util.List;
import java.util.ArrayList;

public class Developer extends People {
    private List<String> languages = new ArrayList();
    private StatusDevExperience level;
    private Specialties specialtie;

    public List<String> getLinguagens() {
        return languages;
    }

    public StatusDevExperience getLevel() {
        return level;
    }

    public void setLevel(StatusDevExperience level) {
        this.level = level;
    }

    public Specialties getSpecialties() {
        return specialtie;
    }

    public void setSpecialties(Specialties specialtie) {
        this.specialtie = specialtie;
    }

    public Developer(){}

    public Developer(String name, int age, List<String> linguagens, StatusDevExperience level, Specialties specialtie) {
        super(name, age);
        this.languages = linguagens;
        this.level = level;
        this.specialtie = specialtie;
    }

    @Override
    public String toString() {
        return "=== PERFIL DEVELOPER ===\n" +
                "Nome: " + getName() + "\n" +       // Vem de People
                "Idade: " + getAge() + "\n" +        // Vem de People
                "Nível: " + level + "\n" +           // Atributo local
                "Especialidade: " + specialtie + "\n" + // Atributo local
                "Linguagens: " + String.join(", ", languages); // Formata a lista bonitinho
    }
}
