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
public class INFANTIL {

   
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       int idade;
       String nome;
    
   
       
       System.out.println("Digite o nome da crianca ");
       nome = sc.next();  
       
       System.out.println("Digite a idade da crianca ");
       idade = sc.nextInt();   
       
       
        if (idade<=2){
           System.out.println(nome + " faz parte do bercario");}
       else if (idade<=4){
           System.out.println(nome + " faz parte do Infantil A");}
       else if (idade<=5){
           System.out.println(nome + " faz parte do Infantil B");}
       else if (idade<=6){
           System.out.println(nome + " faz parte do Infantil C");}
       else {
           System.out.println(nome + " não faz parte da tabela");}
       }
           
}

} 
         