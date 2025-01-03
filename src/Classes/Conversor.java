package Classes;

import java.util.Scanner;

public class Conversor {
    Scanner scanner = new Scanner(System.in);
    private int i = 0;


    public void IniciarInterface(){
        System.out.println(" ********************************************");
        System.out.println("Seja bem vindo/a ao sistema de conversão de moedas!");
        while (this.i != 7){
            System.out.println("""
                    1) Dólar =>>  Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    Esolha uma opção válida:
                    ********************************************
                    """);
            this.i = scanner.nextInt();
        }

    }
}
