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
public class Vetor2 {
     public static void main(String[] args) {
        // Leia dez números inteiros e, ao final, mostre os números lidos
    
   
 Scanner sc = new Scanner(System.in); 
   int numero [] = new int [10];
   
  for(int i=0;i<=9;i++){
           System.out.println("Digite o numero: ");
           numero[i]=sc.nextInt();
  }
   for(int i=0;i<=9;i++){
       System.out.println((i+1)+" - Numero: "+numero[i]);
   }
    
    
    
     }   
}
