package lucasvargas.javaintroducao02.ExerciciosLogicaJava02;

import java.util.Scanner;

public class ExercicioLogico09 {

    static void main() {

        // 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
        // leia o seu peso e sua altura e imprima na tela sua condição
        // de acordo com a tabela abaixo:
        // Fórmula do IMC = peso / (altura) ²
        // Tabela Condições IMC
        // Abaixo de 18,5 | Abaixo do peso
        // Entre 18,6 e 24,9 | Peso ideal (parabéns)
        // Entre 25,0 e 29,9 | Levemente acima do peso
        // Entre 30,0 e 34,9 | Obesidade grau I
        // Entre 35,0 e 39,9 | Obesidarde grau II (severa)
        // Maior ou igual a 40 | Obesidade grau III (mórbida)

        Scanner scan = new Scanner(System.in);

        System.out.println("==== CALCULO DO IMC ====");

        System.out.printf("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.printf(nome + " Digite o seu peso: ");
        double peso = scan.nextDouble();

        System.out.printf(nome + " Digite a sua altura: ");
        double altura = scan.nextDouble();

        double alturaElevada = Math.pow(altura, 2.0);
        double resultadoImc = peso / (alturaElevada);

        if (resultadoImc <= 18.5){

            System.out.println(nome + " voce esta abaixo do peso!");

        } else if (resultadoImc >= 18.6 && resultadoImc <= 24.9) {

            System.out.println(nome + " voce esta no peso ideal (parabéns)");

        } else if (resultadoImc >= 25.0 && resultadoImc <= 29.9) {

            System.out.println(nome + " voce esta levemente acima do peso!");

        } else if (resultadoImc >= 30.0 && resultadoImc <= 34.9) {

            System.out.println(nome + " voce esta na Obesidade grau I");

        } else if (resultadoImc >= 35.0 && resultadoImc <= 39.9) {

            System.out.println(nome + " voce esta na Obesidade grau II (severa)");

        } else if (resultadoImc >= 40.0) {

            System.out.println(nome + " voce esta na Obesidade grau III (mórbida)");
        }

    }
}
