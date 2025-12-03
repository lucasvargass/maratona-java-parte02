package lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.test;

import lucasvargas.javaintroducao02.POOJAVA.AIntroducaoClasses.Dominio.Carro;

public class CarroTest01 {

    static void main() {

        System.out.println("====================== CARRO 01 ===========================");

        Carro carro1 = new Carro();
        carro1.modelo = "HONDA";
        System.out.println("-> Modelo do carro 01: " + carro1.modelo);

        carro1.ano = 2010;
        System.out.println("-> Ano do carro 01: " + carro1.ano);

        carro1.nome = "CIVIC";
        System.out.println("-> Nome do carro 01: " + carro1.nome);

        System.out.println("====================== CARRO 02 ===========================");

        Carro carro2 = new Carro();
        carro2.modelo = "FIAT";
        System.out.println("-> Modelo do carro 02: " + carro2.modelo);

        carro2.ano = 2010;
        System.out.println("-> Ano do carro 02: " + carro2.ano);

        carro2.nome = "PUNTO";
        System.out.println("-> Nome do carro 02: " + carro2.nome);

        System.out.println("===========================================================");


    }
}
