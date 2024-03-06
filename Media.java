/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Media {

    public static void main(String[] args) {
        float n1, n2, n3, n4, mA,mH, mG;
        Scanner in = new Scanner(System.in);
        System.out.println("Dê a nota 1:");
        n1 = in.nextFloat();
        System.out.println("DÊ a nota 2:");
        n2 = in.nextFloat();
        System.out.println("Dê a nota 3:");
        n3 = in.nextFloat();
        System.out.println( "Dê a nota 4:");
        n4 = in.nextFloat();
        //Calcular da média aritmética:
        mA = (n1 + n2 + n3 + n4)/4;
        System.out.println("Média aritmédica: "+mA);
        //Calculo da media harmônica:
        mH = 4/(1/n1 + 1/n2 + 1/n3 + 1/n4);
        System.out.println("Media harmônica:"+mH);
        //Calcular da media geometrica:
        mG = (float) Math.pow((n1*n2 * n3 * n4), 1.0/4);
        System.out.println("Media hormonica:"+mG);
        
    }
}
