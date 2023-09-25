/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class IMC {

   
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       double peso, altura,imc;
       int idade;
       String nome;
    
   
       
       System.out.println("Digite o seu nome: ");
       nome = sc.next();  
       
       System.out.println("Digite a sua idade: ");
       idade = sc.nextInt();  
       
       System.out.println("Digite seu peso ");
       peso = sc.nextDouble();   
       
       System.out.println("Digite sua altura ");
       altura = sc.nextDouble();   
       
       imc= peso/(altura*altura);
       
       System.out.println("NOME:"+ nome+"   IDADE:"+idade);
       System.out.println("PESO"+ peso+"   ALTURA:"+altura);
       System.out.println("SEU IMC É:"+ imc);
       
       if (imc<18.5){
           System.out.println("SUA CLASSIFICAÇÃO É: Abaixo do Peso normal");}
       else if (imc<=24.9){
           System.out.println("SUA CLASSIFICAÇÃO É: Peso Normal");}
       else if (imc<=29.9){
           System.out.println("SUA CLASSIFICAÇÃO É: Excesso de Peso");}
       else if (imc<=34.9){
               System.out.println("SUA CLASSIFICAÇÃO É: Obesidade Classe I");}
       else if (imc<=39.9){
           System.out.println("SUA CLASSIFICAÇÃO É: Obesidade Classe II");}
       else {
          System.out.println( "SUA CLASSIFICAÇÃO É: Obesidade Classe III");}
              
       
}        

}    