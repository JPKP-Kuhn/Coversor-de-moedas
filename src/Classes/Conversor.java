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
            switch (this.i){
                case 1:
                    ExchangeAPI exchangeAPI = new ExchangeAPI();
                    Endereco endereco = exchangeAPI.buscaAPI("USD", "ARS");
                    System.out.println("Digite o valor em Dólar que deseja converter: ");
                    double valor = scanner.nextDouble();
                    System.out.println(valor+"Dólar equivale a " + valor * endereco.conversion_rate() + " Pesos argentinos");
                    System.out.println("********************************************");
                    break;
                case 2:
                    ExchangeAPI exchangeAPI2 = new ExchangeAPI();
                    Endereco endereco2 = exchangeAPI2.buscaAPI("ARS", "USD");
                    System.out.println("Digite o valor em Peso argentino que deseja converter: ");
                    double valor2 = scanner.nextDouble();
                    System.out.println(valor2+" Pesos argentinos equivale a " + valor2 * endereco2.conversion_rate() + " Dólar");
                    System.out.println("********************************************");
                    break;
                case 3:
                    ExchangeAPI exchangeAPI3 = new ExchangeAPI();
                    Endereco endereco3 = exchangeAPI3.buscaAPI("USD", "BRL");
                    System.out.println("Digite o valor em Dólar que deseja converter: ");
                    double valor3 = scanner.nextDouble();
                    System.out.println(valor3+" Dólar equivale a " + valor3 * endereco3.conversion_rate() + " Real brasileiro");
                    System.out.println("********************************************");
                    break;
                case 4:
                    ExchangeAPI exchangeAPI4 = new ExchangeAPI();
                    Endereco endereco4 = exchangeAPI4.buscaAPI("BRL", "USD");
                    System.out.println("Digite o valor em Real brasileiro que deseja converter: ");
                    double valor4 = scanner.nextDouble();
                    System.out.println(valor4+" Real brasileiro equivale a " + valor4 * endereco4.conversion_rate() + " Dólar");
                    System.out.println("********************************************");
                    break;
                case 5:
                    ExchangeAPI exchangeAPI5 = new ExchangeAPI();
                    Endereco endereco5 = exchangeAPI5.buscaAPI("USD", "COP");
                    System.out.println("Digite o valor em Dólar que deseja converter: ");
                    double valor5 = scanner.nextDouble();
                    System.out.println(valor5+" Dólar equivale a " + valor5 * endereco5.conversion_rate() + " Peso colombiano");
                    System.out.println("********************************************");
                    break;
                case 6:
                    ExchangeAPI exchangeAPI6 = new ExchangeAPI();
                    Endereco endereco6 = exchangeAPI6.buscaAPI("COP", "USD");
                    System.out.println("Digite o valor em Peso colombiano que deseja converter: ");
                    double valor6 = scanner.nextDouble();
                    System.out.println(valor6+" Peso colombiano equivale a " + valor6 * endereco6.conversion_rate() + " Dólar");
                    System.out.println("********************************************");
                    break;
            }
        }

    }
}
