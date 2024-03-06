
package com.mycompany.segundoprograma;
import java.util.Scanner;
public class SegundoPrograma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio, area;
        System.out.println("Informe o raio da circustancia:");
        raio = in.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        System.out.println("Area= "+area);
    }
}
