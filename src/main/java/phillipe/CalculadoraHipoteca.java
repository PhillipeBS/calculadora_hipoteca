package main.java.phillipe;

import java.text.NumberFormat;
import java.util.Scanner;

class CalculadoraHipoteca {
    public static void main(String[] args){
        final byte mesesDoAno = 12;
        final byte porcentagem = 100;

        float capital = 0;
        float taxaMensal = 0;
        short meses = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Capital: ");
            capital = scanner.nextFloat();

            if(capital >= 1_000 && capital <= 1_000_000){
                break;
            }
            System.out.println("Digite um número entre 1.000 e 1.000.000!");
        }

        while(true){
            System.out.print("Taxa de juros anual: ");
            float taxaAnual = scanner.nextFloat();

            if(taxaAnual > 0 && taxaAnual <= 30){
                taxaMensal = taxaAnual / mesesDoAno / porcentagem;
                break;
            }
            System.out.println("Digite um número entre 1 e 30!");
        }

        while(true){
            System.out.print("Período (Anos): ");
            byte anos = scanner.nextByte();

            if(anos > 0 && anos <= 30){
                meses = (short) (anos * mesesDoAno);
                break;
            }
            System.out.println("Digite um número entre 1 e 30!");
        }

        double calculoPrestacaoMensal =
                (capital * Math.pow(1 + taxaMensal, meses) * taxaMensal) /
                        (Math.pow(1 + taxaMensal, meses) - 1);

        String prestacaoMensalFormatada = NumberFormat.getCurrencyInstance().format(calculoPrestacaoMensal);

        System.out.println("\nPrestação mensal: " + prestacaoMensalFormatada);
    }
}