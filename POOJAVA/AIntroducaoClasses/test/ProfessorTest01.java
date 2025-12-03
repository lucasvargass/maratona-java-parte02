package lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.test;

import lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.Dominio.Professor;

import java.util.Scanner;

public class ProfessorTest01 {

    static void main() {

        Professor professor = new Professor();
        System.out.println("Professor: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);

    }
}
