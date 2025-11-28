package lucasvargas.javaintroducao02.ExerciciosLogicaJava02;

import java.util.Scanner;

public class ExercicioLogico10 {

    static void main() {

        // 10 - Faça um algoritmo que leia três notas obtidas por um aluno,
        // e imprima na tela a média das notas.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Qual o seu nome aluno: ");
        String nome = scan.nextLine();

        System.out.printf(nome + " Qual foi a sua primeira nota no 1 Trimestre: ");
        double primeiraNota = scan.nextDouble();

        System.out.printf(nome + " Qual foi a sua primeira nota no 2 Trimestre: ");
        double segundaNota = scan.nextDouble();

        System.out.printf(nome + " Qual foi a sua terceira nota no 3 Trimestre: ");
        double terceiraNota = scan.nextDouble();

        double resultadoNota = (primeiraNota + segundaNota + terceiraNota) / 3;
        System.out.println(nome + " a sua media foi: " + resultadoNota);

    }

}
