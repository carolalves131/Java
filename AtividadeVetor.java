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
public class AtividadeVetor {
     public static void main(String[] args) {
         
        /* 1) Desenvolva um programa que guarde 5 números inteiros em um vetorA.
         ao final mostrar o dobro dos números que foram armazenados;
         ou seja; se foi digitado o número 2 imprima : Dobro de 2 = 4 */
    
   
 Scanner sc = new Scanner(System.in); 
 
  int numero [] = new int [10];
  
    for(int i=0;i<=4;i++){
           System.out.println("Digite o numero a ser dobrado: ");
           numero[i]=sc.nextInt();
  }
    System.out.println("RESULTADO DOS CALCULOS: ");
   for(int i=0;i<=4;i++){
       System.out.println("Dobro de "+numero[i]+" = "+(2*numero[i]));
   }
    
     }
    
    
    
    
    
    
    
    
     }   

