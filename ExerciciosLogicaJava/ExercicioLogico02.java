package lucasvargas.javaintroducao02.ExerciciosLogicaJava;

import java.util.Scanner;

public class ExercicioLogico02 {

    static void main() {

        //2 - Faça um algoritmo para receber um número qualquer e imprimir
        // na tela se o número é par ou ímpar, positivo ou negativo.

        int numeroQualquer = 0;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Fale um numero Qualquer: ");
        numeroQualquer = Integer.parseInt(scan.nextLine());

        if (numeroQualquer >= 0){
            if (numeroQualquer % 2 == 0){
                System.out.println("O numero e " + numeroQualquer + " par" + " e positivo");
            }else System.out.println("O numero e " + numeroQualquer + " impar" + " e positivo");
        }else {
            if (numeroQualquer % 2 == 0){
                System.out.println("O numero e " + numeroQualquer + " par" + " e negativo");
            }else System.out.println("O numero e " + numeroQualquer + " impar" + " e nagativo");
        }


    }
}
