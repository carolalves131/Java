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
public class pesquisa {

   
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       int idade, contador = 0,homens=0,mulheres=0;
       String nome, sexo, resposta,avaliacao;
       
               
       
      System.out.println("Deseja iniciar um novo questionário (Digite s para sim e n para não) ");
       resposta = sc.next();  
     
       while (resposta.equals ("s")|resposta.equals ("S")){
       System.out.println("Digite o nome da pessoa entrevistada: ");
       nome = sc.next();  
       
       System.out.println("Digite a idade da pessoa entrevistada: ");
       idade = sc.nextInt();  
       
       System.out.println("Digite o sexo da pessoa entrevistada (digite f para mulher, e h para homem) ");
       sexo = sc.next();   
       
       System.out.println("Qual a avaliação do produto testado? (Digite p para positiva e n para negativa)");
       avaliacao= sc.next();   
       
     
       System.out.println("NOME:"+ nome);
       System.out.println("IDADE:"+idade);
       System.out.println("SEXO"+ sexo);
       System.out.println("GOSTOU DO PRODUTO?"+ avaliacao);
       
        
        
        System.out.println("\nDeseja registrar uma nova pesquisa? (Digite s para sim e n para não)");
       resposta=sc.next();
       
      contador++;
      
      if (sexo.equals ("f")){
           mulheres++;}
           
            if (sexo.equals ("m")){
           homens++;}
           
           
       }
       
        System.out.println ("\nQuantidade de pessoas que respoderam a pesquisa = "+ contador);
       System.out.println ("Quantidade de homens que responderam a pesquisa = "+ homens);
        System.out.println ("Quantidade de mulheres que responderam a pesquisa = "+ mulheres);
}   
} 