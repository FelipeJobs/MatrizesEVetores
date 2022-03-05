package Exercícios;
import java.util.Scanner;
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição
das matrizes N1 e N2.
4.	Crie um programa que receba valores */
public class SomaDeMatrizes {
    public static void main(String[] args) {
        double n1[][] = new double[4][6];
        double n2[][] = new double[4][6];
        double m1[][] = new double[4][6];
        double m2[][] = new double[4][6];
        int c,l;
        Scanner input = new Scanner(System.in);
        for(l = 0; l<4;l++){
            for(c = 0; c<6;c++){
                System.out.println("digite o valor da linha " +(l+1) + " e coluna " + (c+1) +" da 1º matriz: ");
                n1[l][c] = input.nextDouble();
                System.out.println("digite o valor da linha " +(l+1) + " e coluna " + (c+1) +" da 2º matriz: ");
                n2[l][c] = input.nextDouble();
                m1[l][c]= n1[l][c] + n2[l][c];
                m2[l][c]= Math.abs( n1[l][c] - n2[l][c]);
            }}
        System.out.println("A 1º matriz é:\n");
        for(l = 0; l<4;l++){
            for(c = 0; c<6;c++){
                System.out.println(n1[l][c] + "|");}
            System.out.println("\n");
        }
        System.out.println("\nA 2º matriz é:\n");
        for(l = 0; l<4;l++){
            for(c = 0; c<6;c++){
                System.out.println(n2[l][c] + "|");}
            System.out.println("\n");
        }
        System.out.println("\nA soma da matriz 1 e 2 é:\n");
        for(l = 0; l<4;l++){
            for(c = 0; c<6;c++){
                System.out.print(m1[l][c] + "|");}
            System.out.println("\n");
        }
        System.out.println("\nA subtração da matriz 1 e 2 é:\n");
        for (l = 0; l<4;l++){
            for(c = 0; c<6;c++){
                System.out.print(m2[l][c] + "|");}
            System.out.println();
        }


    }
}
