/*
 Faça um programa que calcule a área de um triângulo de largura e altura dados pelo 
usuário. O programa deve exibir a área calculada.
 */

package com.mycompany.areaalturalargura;
import java.util.Scanner;
public class AreaAlturaLargura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do triângulo:");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        double altura = scanner.nextDouble();

        double area = calcularAreaTriangulo(largura, altura);

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
    public static double calcularAreaTriangulo(double largura, double altura) {
        return (largura * altura) / 2.0; // Fórmula para calcular a área do triângulo
    }
}
