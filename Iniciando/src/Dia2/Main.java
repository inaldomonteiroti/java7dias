package Dia2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valores = {10,20,15,30,40};
        Arrays.sort(valores);

        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);

        String[] cars = { "BMW", "Tesla", "Jeep", "Fiat"};
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);

    }
}