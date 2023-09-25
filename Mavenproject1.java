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
public class Mavenproject1 {

   
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       Double nota1,nota2,nota3,nota4,media;
    
   
       
       System.out.println("Digite a primeira nota: ");
       nota1 = sc.nextDouble();  
       
       System.out.println("Digite a segunda nota: ");
       nota2 = sc.nextDouble();   
       
       System.out.println("Digite a terceira nota: ");
       nota3 = sc.nextDouble();        
       System.out.println("Digite a quarta nota: ");
       nota4 = sc.nextDouble(); 
       
        media = (nota1+nota2+nota3+nota4)/4;
        /*
       if (media>=6){
           System.out.println("Aprovado");}
       else if (media<=3){System.out.println("Reprovado");}
       else {System.out.println("recuperacao");}*/
       
        if (media<3){
           System.out.println("Reprovadoo");}
       else if (media>=6){System.out.println("Aprovado");}
       else {System.out.println("Recuperação");}
}

} 
         