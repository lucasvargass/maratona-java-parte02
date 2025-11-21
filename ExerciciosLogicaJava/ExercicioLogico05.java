package lucasvargas.javaintroducao02.ExerciciosLogicaJava;

import java.util.Scanner;

public class ExercicioLogico05 {

    static void main() {

        // Faça um algoritmo que leia o valor do salário mínimo
        // e o valor do salário de um usuário, calcule quantos salários mínimos esse
        // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        double salario = 0;
        double salarioMin = 1293.20;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o seu salario: ");
        salario = scan.nextInt();

        double resultadoSalarioMin = salario / salarioMin;
        System.out.println(resultadoSalarioMin);



    }
}
