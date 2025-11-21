package lucasvargas.javaintroducao02.ExerciciosLogicaJava;

import java.util.Scanner;

public class ExercicioLogico03 {

    static void main() {

        //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B
        // forem iguais, deverá somar os dois valores,
        // caso contrário deve-se multiplicar A por B. Ao final de qualquer um dos
        // cálculos deve-se referir o resultado a uma variável C e
        // imprimir seu valor na tela

        int letraA = 0;
        int letraB = 0;
        int resultadoSoma = 0;
        int resultadoMulti = 0;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Escreva um valor para a letra A: ");
        letraA = scan.nextInt();

        System.out.printf("Escreva um valor para a letra B: ");
        letraB = scan.nextInt();

        if (letraA == letraB){
            resultadoSoma = letraA + letraB;
            System.out.println("Resultados iguais: " + resultadoSoma);
        }else {
            resultadoMulti = letraA * letraB;
            System.out.println("Resultados diferentes: " + resultadoMulti);
        }



    }
}
