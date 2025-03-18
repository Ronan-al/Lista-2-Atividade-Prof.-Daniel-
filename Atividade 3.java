// Atividade  faça um programa que leia as 4 notos bimestrais e mostre a media do aluno 

import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:/n");
        double nota1 = nota.nextDouble();
       
        System.out.println("Digite a segunda nota:/n");
        double nota2 = nota.nextDouble();
       
        System.out.println("Digite a Terceira nota:/n");
        double nota3 = nota.nextDouble();
    
        System.out.println("Digite a Quarta nota:/n");
        double nota4 = nota.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A media  das 4 notas do aluno é: " + media);
        
        nota.close();
        
    
    
    
    }



}

