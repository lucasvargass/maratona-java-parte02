package lucasvargas.javaintroducao02.Arrays.ArraysMultidimensionais;

public class Aula08ArraysMultidimensionais01 {

    static void main() {

        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

        dias[2][0] = 1;
        dias[2][1] = 2;
        dias[2][2] = 3;

        for (int i = 0; i < dias.length; i++) {
            System.out.println("========================");
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[i][j]);

            }
        }

        // FOREACH

        for (int[] ArryBase : dias){
            for (int num : ArryBase){
                System.out.println(num);
            }

        }


    }

}
