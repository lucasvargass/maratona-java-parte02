package lucasvargas.javaintroducao02.ExerciciosLogicaJava;

import java.util.Scanner;

public class ExercicioLogico01 {

    static void main() {

        // 1 - Faça um algoritmo que leia os valores de A, B, C
        // e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        int letraB = 0;
        int letraA = 0;
        int letraC = 0;
        int resultadoSoma = 0;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Escreva um valor para a letra A: ");
        letraA = scan.nextInt();

        System.out.printf("Escreva um valor para a letra B: ");
        letraB = scan.nextInt();

        System.out.printf("Escreva um valor para a letra C: ");
        letraC = scan.nextInt();

        resultadoSoma = letraA + letraB;
        System.out.println("A soma entre eles e: " + resultadoSoma);

        if (resultadoSoma < letraC){
            System.out.println("A soma e menor que a letra C");
        }else {
            System.out.println("A soma e maior que a letra C");
        }

    }



}
