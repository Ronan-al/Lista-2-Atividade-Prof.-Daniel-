        // Atividade 2  lista 2 de exercicios
        // Faça um programa que leia dois números inteiros e imprima a soma, subtração e multiplicação dos mesmos.
        //Professor: Daniel Henrique.
import java.util.Scanner;
public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
    int soma = n1 + n2;
    int sub = n1 - n2;
    int mult = n1 * n2;
    
        System.out.println(n1 + "+" + n2 + "=" + soma);
    
        System.out.println(n1 + "-" + n2 + "=" + sub);
   
        System.out.println(n1 + "*" + n2 + "=" + mult);
    
    sc.close();
    }

}      
        