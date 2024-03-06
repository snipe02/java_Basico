// Escreva um programa em Java que calcule a área de um círculo a partir do raio informado 
//pelo usuário.

package com.mycompany.primeiroprograma1;
import java.util.Scanner;
public class PrimeiroPrograma1{
    public static void main(String[] args){
        double distancia, qtdeCombustivel,consumo;
        Scanner in = new Scanner(System.in);
        System.out.println("Dê a distancia percorrida:");
        distancia = in.nextDouble();
        System.out.println("Dê a qtde de combistivel gasto: ");
        qtdeCombustivel = in.nextDouble();
        consumo = distancia/qtdeCombustivel;
        System.out.println("Consumo médio:"+ consumo+"Km/l");
    }
}