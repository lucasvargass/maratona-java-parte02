package lucasvargas.javaintroducao02.Arrays.ArraysMultidimensionais;

public class Aula08ArraysMultidimensionais02 {

    static void main() {

        // Inicialização

        int [][] arraysInt = new int[3][];

        arraysInt[0] = new int[]{1};
        arraysInt[1] = new int[]{1,2};
        arraysInt[2] = new int[]{1,2,3};

        int [][] arraysInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : arraysInt2){
            System.out.println("\n=============");
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }

    }
}
