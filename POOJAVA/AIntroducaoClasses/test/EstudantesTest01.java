package lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.test;

import lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.Dominio.Estudantes;

public class EstudantesTest01 {

    static void main() {

        System.out.println("==============================================");

        Estudantes estudante01 = new Estudantes();
        String resultadoNome = estudante01.nome01;
        System.out.println("Aluno: " + resultadoNome);

        int resultadoIdade = estudante01.idade01;
        System.out.println("Idade: " + resultadoIdade);

        char resultadoSexo = estudante01.sexo01;
        System.out.println("Sexo: " + resultadoSexo);

        System.out.println("==============================================");

        Estudantes.Estudante02 estudante02 = new Estudantes.Estudante02();
        String resultadoNome02 = estudante02.nome02;
        System.out.println("Aluna: " + resultadoNome02);

        int resultadoIdade02 = estudante02.idade02;
        System.out.println("Idade: " + resultadoIdade02);

        char resultdadoSexo = estudante02.sexo02;
        System.out.println("Sexo: " + resultdadoSexo);

        System.out.println("==============================================");


    }
}
