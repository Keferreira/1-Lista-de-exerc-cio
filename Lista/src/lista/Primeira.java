/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Kécila
 */
public class Primeira {

     public static void main(String[ ]args){
          Scanner teclado= new Scanner(System.in);

System.out.println("Digite a nota da prova1:");
double prova1= teclado.nextDouble( );

System.out.println("Digite a nota da prova2:");
double prova2= teclado.nextDouble( );

System.out.println("Digite a nota da prova3:");
double prova3= teclado.nextDouble( );

double media= (prova1+prova2+prova3)/3;

if(media>=7){

System.out.println("Media:"+media);
System.out.println("Aprovado!!");

} else{
      System.out.println("Media: " +media);
System.out.println("Digite a nota da rec");
double rec= teclado.nextDouble( );

double mediaFinal=(media+rec)/2;

if(mediaFinal>=5){
     System.out.println("Mediafinal: " +mediaFinal);
    System.out.println("Aprovado na rec!");    
}else{
        System.out.println("Reprovado na rec!"); 
        }
     }
     }
}
    