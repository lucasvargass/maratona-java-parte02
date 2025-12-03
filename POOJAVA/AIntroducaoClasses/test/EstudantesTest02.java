package lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.test;

import lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.Dominio.Estudantes;

public class EstudantesTest02 {

    static void main() {

        System.out.println("===============================================");

        Estudantes estudantes01 = new Estudantes();
        System.out.println("Aluno: " + estudantes01.nome01);
        System.out.println("Idade: " + estudantes01.idade01);
        System.out.println("Sexo: " + estudantes01.sexo01);

        System.out.println("===============================================");

        Estudantes.Estudante02 estudantes02 = new Estudantes.Estudante02();
        System.out.println("Aluna: " + estudantes02.nome02);
        System.out.println("Idade: " + estudantes02.idade02);
        System.out.println("Sexo: " + estudantes02.sexo02);

        System.out.println("===============================================");


    }

}
