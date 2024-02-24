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
public class Segunda {
     public static void main(String args[ ])  {

       Scanner teclado = new Scanner(System.in);
        System.out.print("quantidade de livros:  ");
      int quantidade  = teclado.nextInt( );

     double criterioA  = (0.25*quantidade)+7.50;
     double criterioB  = (0.50*quantidade)+2.50;

      if (criterioA>criterioB) {

      System.out.println("criterio B é melhor preço:   \nCriterio A:"+criterioA+"\nCriterio B:"+criterioB);
      }
      else
      if (criterioA<criterioB) {
          System.out.println("criterio A é melhor preço:   \nCriterio A:"+criterioA+"\nCriterio B:"+criterioB);
      }
      else{
       System.out.println("Os dois tem o mesmo preço:   \nCriterio A:"+criterioA+"\nCriterio B:"+criterioB);
     }
}
     }
