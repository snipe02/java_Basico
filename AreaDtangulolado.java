/*
 Faça um programa que calcule a área de um retângulo de lados informados pelo usuário. 
O programa deve exibir a área calculada.
 */

package com.mycompany.areadtangulolado;

import java.util.Scanner;

public class AreaDtangulolado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();

        double area = calcularAreaRetangulo(comprimento, largura);

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }

    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }
}
