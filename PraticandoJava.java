package Exercicio107082018;

import java.util.Scanner;

public class PraticandoJava {
    Scanner input = new Scanner(System.in);
    
    public static void Maior(int a, int b){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = input.nextInt();
        System.out.println("Digite o segundo número: ");
        b = input.nextInt();

        if (a > b){
            System.out.println("número maior é: " + a);
        }
        else if(b > a){
            System.out.println("número maior é: " + b);
        }
        else{
            System.out.println("Números iguais.");
        }
        
    }
    
    public static void MudandoOrdem(int a, int b, int c){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o um número: ");
        a = input.nextInt();
        System.out.println("Digite outro número: ");
        b = input.nextInt();
        
        System.out.println("O primeiro número foi: " + a);
        System.out.println("O segundo número foi: " + b + "\n");
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("A ordem invertida é: " + a + " e " + b);
    }
    
    public static void Conversao(float a){
        Scanner input = new Scanner(System.in);
        
        float b;
        
        System.out.println("Digite a temperatura em Graus C°: ");
        a = input.nextFloat();
        
        b = (9*a+160)/5;
        System.out.println("A temperatura em F° é: " + b);
    }
    
    public static void Opcao(int a, int b){
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - SOMAR" + "\n" + "2 - SUBTRAÇÃO" + "\n" + 
        "3 - MULTIPLICAÇÃO" + "\n" + "4 - DIVISÃO");
        int escolha = input.nextInt();
        int resultado;
        
        System.out.println("Digite um número: ");
        a = input.nextInt();
        System.out.println("Digite um número: ");
        b = input.nextInt();
        
        switch(escolha){
            case 1: 
                resultado = a+b;
                System.out.println("O resultado da soma foi: " + resultado);
                break;
            case 2:
                resultado = a-b;
                System.out.println("O resultado da subtração foi: " + resultado);
                break;
            case 3:
                resultado = a*b;
                System.out.println("O resultado da multiplicação foi: " + resultado);
                break;
            case 4:
                resultado = a/b;
                System.out.println("O resultado da divisão foi: " + resultado);
                break;
            default:
                System.out.println("Somente opções válidas!");
        }
    }
    
    public static void main(String[] args){
            
       Opcao(0,0);
        
    }
          
}

