package lucasvargas.javaintroducao02.ExerciciosLogicaJava02;

import java.util.Scanner;

public class ExercicioLogico08 {

    static void main() {
        
        // Faça um algoritmo que leia três valores inteiros diferentes 
        // e imprima na tela os valores em ordem decrescente.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero01 = scan.nextInt();

        System.out.printf("Digite outro numero: ");
        int numero02 = scan.nextInt();

        System.out.printf("Digite o terceiro numero: ");
        int numero03 = scan.nextInt();

        int[] valores = {numero01, numero02, numero03};

        System.out.println("Valores em ordem descrescente!");
        for (int i = valores.length - 1; i >= 0  ; i--) {
            System.out.println(valores[i] + " ");
        }
        
    }
}
