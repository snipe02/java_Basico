/*Um vendedor recebe um salário fixo mensal mais um percentual de comissão sobre o 
total das vendas por ele realizadas. Ele deseja um programa para calcular o salário total 
a receber ao final no mês. Faça um programa em Java para obter do usuário as entradas: 
salário fixo, total de vendas e percentual de comissão sobre as vendas. Em seguida, 
calcule e exiba o salário final a receber.*/

package com.mycompany.terceiroprograma3;
import java.util.Scanner;
public class TerceiroPrograma3 {            
                                                                                     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioFixo, percentualCom, totalVendas;
        double comissao, salarioFinal;
        //obtendo as entradas do usuario
        System.out.println("informe seu salario fixo:");
        salarioFixo = in.nextDouble();
        System.out.println("informe o total de vendido:");
        totalVendas = in.nextDouble();
        System.out.println("informe sua comissão em porcentagem:");
        percentualCom = in.nextDouble();
        
        //Calculo da comissão
        comissao = totalVendas * percentualCom/100;
        
        //Calculo do salario final
        salarioFinal = salarioFixo + comissao;
        System.out.println("Seu salario final será de R$"+salarioFinal);
    }
}
