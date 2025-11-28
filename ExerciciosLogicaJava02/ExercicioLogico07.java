package lucasvargas.javaintroducao02.ExerciciosLogicaJava02;

import java.util.Scanner;

public class ExercicioLogico07 {

    static void main() {

        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
        // e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor booleano: ");
        boolean numero01 = scan.nextBoolean();

        System.out.printf("Digite outro valor booleano: ");
        boolean numero02 = scan.nextBoolean();

        if (numero01 && numero02){

            System.out.println("O valor e Verdadeiro");

        } else if (!numero01 && !numero02) {

            System.out.println("O valor e falso");

        }else{

            System.out.printf("Valor diferente!");
        }

    }
}
