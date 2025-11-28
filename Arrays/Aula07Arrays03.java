package lucasvargas.javaintroducao02.Arrays;

public class Aula07Arrays03 {

    static void main() {

        // ARRAYS - Foreach

        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for (int num2 : numeros2){
            System.out.println(num2);
        }

        for (int num3 : numeros3){
            System.out.println(num3);
        }

    }
}
