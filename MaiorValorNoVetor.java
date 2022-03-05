package Exercícios;
import java.util.Arrays;
import java.util.Scanner;
/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação
de uma atividade e o escreva em seguida. Encontre após a maior pontuação
e a apresente.*/
public class MaiorValorNoVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pontuacao[] = new double[5];
        double maior=0.0;
        for (int c = 0; c < pontuacao.length ; c++) {
            System.out.print("Digite o " + (c+1) + "º valor que será armazenado: ");
            pontuacao[c] = input.nextDouble();
            if(pontuacao[c]> maior){
                maior = pontuacao[c];}
        }
        System.out.println("\33[32mAs pontuação armenadas São: " + Arrays.toString(pontuacao));
        System.out.println("\33[36mA maior pontuação foi: " + maior);
    }}
