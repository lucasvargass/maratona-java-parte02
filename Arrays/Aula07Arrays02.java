package lucasvargas.javaintroducao02.Arrays;

public class Aula07Arrays02 {

    static void main() {

        // ARRAYS - PARTE 02

        // byte, short, int, long, float, double 0
        // char '/u0000'
        // boolean false
        // String null

        String nome01 = "Lucas";
        String nome02 = "João";
        String nome03 = "Lorena";

        String[] nome = new String[3];
        nome[0] = nome01;
        nome[1] = nome02;
        nome[2] = nome03;

        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(nome[2]);

        // ARRAYS - PARTE 03
        // EXERCICIO PARA MUNDANÇA DE POSIÇÃO SEM ALTERAR

        int idade01 = 19;
        int idade02 = 20;
        int idade03 = 21;

        int[] idades = new int[4];
        idades[0] = idade01;
        idades[1] = idade02;
        idades[2] = idade03;
        idades[3] = 22;

        // AQUI RODA COM ALTERAÇÃO
        for (int i = 0; i < 3; i++) {
            System.out.println(idades[i]);

        }

        // AQUI RODA SEM ALTERAÇÃO
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }


    }
}
