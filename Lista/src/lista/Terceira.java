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
public class Terceira {
    public static void main(String args[ ])  {
    Scanner teclado= new Scanner(System.in);

      System.out.println("Digite o primeiro intervalo de tempo:  ");
      System.out.println("Horas:  ");
      int h1= teclado.nextInt( );
     System.out.print("Minutos:  ");
     int m1= teclado.nextInt( );
     System.out.print("Segundos:  ");
     int s1=teclado.nextInt( );

     System.out.print("Digite o segundo intervalo de tempo:  ");
     System.out.print("\nHoras:  ");
     int h2= teclado.nextInt( );
     System.out.print("Minutos:  ");
     int m2= teclado.nextInt( );
     System.out.print("Segundos:  ");
     int s2= teclado.nextInt( );

     int sh= h1+h2;
     int sm= m1+m2;
     int ss= s1+s2;

     int dh= h2-h1;
     int dm= m2-m1;
      int ds= s2-s1;

     if(ss>=60) {
     ss-= 60;
     sm+= 1;
    }
     if( sm>= 60) {
     sm-= 60;
      sh+= 1;

     }
     if ( ds<= -1) {
      ss+= 60;
       sm-= 1;
    }
     if (dh<= 1) { 
     dm+= 60;
     dh-= 1;

       }
      System.out.println("\n Soma dos intervalos de tempo: ");
      System.out.printf("%02d:%02d:%02d\n",sh,sm,ss );

      System.out.println("\nDiferenca dos intervalos de tempo:  ");
      System.out.printf("%02d:%02d:%02d\n",dh,dm,ds);

}
}