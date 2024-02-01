package Dia1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner primeiroScanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero ");
        int numero1 = primeiroScanner.nextInt();

        Scanner segundoScanner = new Scanner(System.in);
        System.out.print("Digite o segundo numero ");
        int numero2 = segundoScanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println( "A soma dos numeros é: " + soma);




    }
}