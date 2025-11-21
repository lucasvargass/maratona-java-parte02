package lucasvargas.javaintroducao02.ExerciciosLogicaJava;

import java.util.Scanner;

public class ExercicioLogico04 {

    static void main() {

        //4 - Faça um algoritmo que receba um número inteiro e imprima
        // na tela do seu antecessor e do seu sucessor.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero01 = scan.nextInt();

        int antecessor = numero01 - 1;
        int sucessor = numero01 + 1;

        System.out.println("O numero e " + numero01 + " seu antecessor " + antecessor);
        System.out.println("O numero e " + numero01 + " seu sucessor " + sucessor);
    }
}
