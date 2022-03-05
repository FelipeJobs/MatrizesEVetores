package Exercícios;
import java.util.Arrays;
import java.util.Random;
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
foram as ocorrências da maior pontuação.*/
public class Dado {
    public static void main(String[] args) {
       Random random = new Random();
       int dados[] = new  int[10],cont=0;
       double media,maior=0, soma=0;
        for (int c = 0; c < dados.length ; c++) {
            dados[c] = random.nextInt(7);
            if(dados[c]==0){
                c=c-1;
                continue;
            }
            if (dados[c] > maior) {
                maior = dados[c];
            }
            soma+=dados[c];}
            for (int i = 0; i < dados.length; i++) {
                if(dados[i]== maior){
                    cont++;}
            }
            media = soma/10;
        System.out.println("Os valores adquiridos no dado foram:\n" + Arrays.toString(dados));
        System.out.println("A media dos valores foi: " + media);

        if(cont == 1){
           System.out.println("O valor mais alto foi: " + maior + " e ele saiu " + cont + " vez.");
        }
        else{
        System.out.println("O valor mais alto foi: " + maior + " e ele saiu " + cont + " vezes.");}
    }}
