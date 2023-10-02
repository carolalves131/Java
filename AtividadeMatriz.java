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
public class AtividadeMatriz {
     public static void main(String[] args) {
          /* 1)  Desenvolva um programa que guarde 10 números inteiros em uma matriz 5 x 2.
         Ao final mostrar o dobro dos números que foram armazenados; ou seja;
         se foi digitado o número 2 imprima : Dobro de 2 = 4 */
    
   
 Scanner sc = new Scanner(System.in); 
 
 int numero[][]= new int [5][2];
   
  for(int i=0;i<=4;i++){
      for(int j=0;j<=1;j++){
          System.out.println("Digite os numeros : ");
           numero[i][j]=sc.nextInt();
      }
  }
      
      
           
          
 

 System.out.println("Dobro dos armazenados na Matriz 5x2");
  for(int i=0;i<=4;i++){
       System.out.println(" ");
      for(int j=0;j<=1;j++){
       System.out.print((2*numero[i][j])+" ");
   
       
       
   
    
    
     }   }
}
}