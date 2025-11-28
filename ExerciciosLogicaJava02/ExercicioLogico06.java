package lucasvargas.javaintroducao02.ExerciciosLogicaJava02;

import java.util.Scanner;

public class ExercicioLogico06 {

    static void main() {

        // 6 - Faça um algoritmo que leia um valor qualquer e
        // imprima na tela com um reajuste de 5%.

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero = scan.nextInt();

        int reajusteTotal = numero * 5;
        int reajusteResultado = numero + reajusteTotal;

        System.out.println("No reajuste de 5% e: " + reajusteResultado);

    }
}
