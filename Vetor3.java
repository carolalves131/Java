/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Vetor3 {
     public static void main(String[] args) {
        // Leia o nome e a idade de 5 pessoas e mostre ao filnal
    
   
 Scanner sc = new Scanner(System.in); 
  String nome[]=new String [5];
 int idade[]= new int [5];
   
  for(int i=0;i<=4;i++){
           System.out.println("Digite o nome: ");
           nome[i]=sc.next();
           System.out.println("Digite a idade: ");
           idade[i]=sc.nextInt();
  }
   for(int i=0;i<=4;i++){
       System.out.println((i+1)+" - Nome: "+nome[i]+ ", Idade: "+idade[i]);
       
       
   }
    
    
    
     }   
}
