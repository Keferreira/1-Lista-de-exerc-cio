/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Kécila
 */
public class Quarta {
    public static void main(String args[ ])  {
        int n=-1,nd;
        Scanner teclado= new Scanner(System.in);
      while(n<0) {
      System.out.println("informe um numero maior que zero:  ");
      n= teclado.nextInt( );
      if(n>=0){
      nd= contdigitos(n);
     System.out.println("numero de digitos:  "+nd);
    }
     }

    }
     public static int contdigitos(int n) {
     int count= 0;
     if(n==0){
     return 1;
     }
     while(n!=0) {
         count ++;
          n/=10;
     }
     return count;
    }
    }

