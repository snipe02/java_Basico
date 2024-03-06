
package com.mycompany.temperaturasemanal;

import java.util.Scanner;
public class TemperaturaSemanal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float temp[] = new float[7];  
        for (int i=0; i < temp.length; i++){
            System.out.println("Temperatura(dia"+(i+i)+"):");
            temp[i] = in.nextFloat();
        }
    }
}
