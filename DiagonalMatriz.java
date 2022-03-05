package Exercícios;
import java.util.Scanner;
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
diagonal, ou seja, diagonal principal.*/
public class DiagonalMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matriz[][] = new double[3][3],soma=0.0,somad =0.0;
        for (int l = 0; l < matriz.length ; l++) {
            for (int c = 0; c <matriz[l].length ; c++) {
                System.out.print("Digite o valor da posição " + (l+1) + "X" + (c+1) +": ");
                matriz[l][c] = input.nextDouble();
                soma+=matriz[l][c];
                if(l==c){
                    somad+=matriz[l][c];}
            }}
        System.out.println(" A soma de todos valores é: " + soma);
        System.out.println(" A soma de todos valores da diagonal é: " + somad);
    }}
