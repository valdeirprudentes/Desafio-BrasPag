package desafioBrasPag;

import java.util.Scanner;

public class Algo {
    public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("==== Adquirente A ==== \n");
       System.out.println("Cartão: Visa_Crédito");
       System.out.println("Digite o valor total ou máximo: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Digite o valor líquido: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("A porcentagem é = " + percentage + " %");
    }
}